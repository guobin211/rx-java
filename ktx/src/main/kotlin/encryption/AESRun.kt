package encryption

import java.util.*
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.SecretKeySpec

/**
 * AESRun
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 10:03 下午
 * @version 0.0.1
 */
object AESRun {
    /**
     * 16个字符 128位
     */
    private const val PASSWORD = "0123456789abcdef"

    fun encrypt(s: String): String {
        val cipher = Cipher.getInstance("AES")
        // 秘钥
        val key: SecretKey = SecretKeySpec(PASSWORD.toByteArray(), "AES")
        // 加密模式
        cipher.init(Cipher.ENCRYPT_MODE, key)
        return Base64.getEncoder().encodeToString(cipher.doFinal(s.toByteArray()))
    }

    fun decrypt(s: String): String {
        val cipher = Cipher.getInstance("AES")
        // 秘钥
        val key: SecretKey = SecretKeySpec(PASSWORD.toByteArray(), "AES")
        // 解密模式
        cipher.init(Cipher.DECRYPT_MODE, key)
        val ec = Base64.getDecoder().decode(s.toByteArray())
        return String(cipher.doFinal(ec))
    }

}

fun main() {
    val username = "admin"
    val encode = AESRun.encrypt(username)
    println(encode)

    println(AESRun.decrypt(encode))
}
