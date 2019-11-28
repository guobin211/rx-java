package encryption

import java.io.ByteArrayOutputStream
import java.security.*
import java.security.spec.KeySpec
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.util.*
import javax.crypto.Cipher
import javax.crypto.interfaces.PBEKey

/**
 * RSARun
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 10:24 下午
 * @version 0.0.1
 */

object RSARun {
    /**
     * RSA对称加密
     */
    private const val TRANSFORM_MODE = "RSA"
    /**
     * 分段加密 117字节
     */
    private const val ENCODE_MAX_SIZE = 117
    /**
     * 分段解密 256字节
     */
    private const val DECODE_MAX_SIZE = 256

    /**
     * 生成秘钥对
     */
    fun getRsaKey(): KeyPair {
        val keyPairGenerator = KeyPairGenerator.getInstance(TRANSFORM_MODE)
        val keyPair = keyPairGenerator.genKeyPair()
        println("publicKey:")
        println(Base64.getEncoder().encodeToString(keyPair.public.encoded))
        println("privateKey:")
        println(Base64.getEncoder().encodeToString(keyPair.private.encoded))
        return keyPair
    }

    /**
     * 私钥加密
     * 分段加密
     */
    fun encryptByPrivateKey(i: String, key: PrivateKey): String {
        val cipher = Cipher.getInstance(TRANSFORM_MODE)
        val byteArray = i.toByteArray()
        cipher.init(Cipher.ENCRYPT_MODE, key)
        var temp: ByteArray
        var offset = 0
        val os = ByteArrayOutputStream()
        while (byteArray.size - offset > 0) {
            if (byteArray.size - offset >= ENCODE_MAX_SIZE) {
                temp = cipher.doFinal(byteArray, offset, ENCODE_MAX_SIZE)
                offset += ENCODE_MAX_SIZE
            } else {
                temp = cipher.doFinal(byteArray, offset, byteArray.size - offset)
                offset = byteArray.size
            }
            os.write(temp)
        }
        os.close()
        return Base64.getEncoder().encodeToString(os.toByteArray())
    }

    /**
     * 公钥解密
     */
    fun decryptByPublicKey(i: String, key: PublicKey): String {
        val cipher = Cipher.getInstance(TRANSFORM_MODE)
        cipher.init(Cipher.DECRYPT_MODE, key)
        val byteArray = Base64.getDecoder().decode(i)
        var temp: ByteArray
        var offset = 0
        val os = ByteArrayOutputStream()
        while (byteArray.size - offset > 0) {
            if (byteArray.size - offset >= DECODE_MAX_SIZE) {
                temp = cipher.doFinal(byteArray, offset, DECODE_MAX_SIZE)
                offset += DECODE_MAX_SIZE
            } else {
                temp = cipher.doFinal(byteArray, offset, byteArray.size - offset)
                offset = byteArray.size
            }
            os.write(temp)
        }
        os.close()
        return String(os.toByteArray())
    }
}

fun main() {
    val value = "admin123456789admin123456789"
    val rsaKey = RSARun.getRsaKey()

    val encode = RSARun.encryptByPrivateKey(value, rsaKey.private)
    println(encode)
    println(RSARun.decryptByPublicKey(encode, rsaKey.public))
    // 字符串转key对象
    val keyStr = Base64.getEncoder().encodeToString(rsaKey.private.encoded)
    val privateKey: PrivateKey = KeyFactory.getInstance("RSA")
        .generatePrivate(PKCS8EncodedKeySpec(Base64.getDecoder().decode(keyStr)))
    println(privateKey)

    val publicStr = Base64.getEncoder().encodeToString(rsaKey.public.encoded)
    val publicKey: PublicKey = KeyFactory.getInstance("RSA")
        .generatePublic(X509EncodedKeySpec(Base64.getDecoder().decode(publicStr)))
    println(publicKey)
}
