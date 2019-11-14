package encryption

import java.security.Key
import java.util.*
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESKeySpec

/**
 * CipherRun
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 9:41 下午
 * @version 0.0.1
 */
object DESRun {
    /**
     * 8个字符/字节 (一个字节8位)
     */
    private const val PASSWORD = "12345678"

    fun encrypt(s: String): String {
        val cipher = Cipher.getInstance("DES")
        val kf = SecretKeyFactory.getInstance("DES")
        val keySpec = DESKeySpec(PASSWORD.toByteArray())
        val key: Key = kf.generateSecret(keySpec)
        // 加密模式
        cipher.init(Cipher.ENCRYPT_MODE, key)
        val bytes = cipher.doFinal(s.toByteArray())
        // base64字节兼容
        return Base64.getEncoder().encodeToString(bytes)
    }

    fun decrypt(s: String): String {
        val cipher = Cipher.getInstance("DES")
        val kf = SecretKeyFactory.getInstance("DES")
        val keySpec = DESKeySpec(PASSWORD.toByteArray())
        val key: Key = kf.generateSecret(keySpec)
        // 解密模式
        cipher.init(Cipher.DECRYPT_MODE, key)
        // base64解码
        val ec = Base64.getDecoder().decode(s)
        return String(cipher.doFinal(ec))
    }
}

fun main() {
    val value = "admin"

    val encode = DESRun.encrypt(value)
    println(encode)

    println(DESRun.decrypt(encode))
}