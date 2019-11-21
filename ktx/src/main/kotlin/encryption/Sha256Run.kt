package encryption

import java.security.MessageDigest

/**
 * Sha256Run
 * ktx
 * @author guobin211
 * @date 2019/11/21 at 9:42 下午
 * @version 0.0.1
 */
object Sha256Run {
    /**
     * sha256加密
     */
    fun getSha256(input: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val res = digest.digest(input.toByteArray())
        return Util.toHex(res)
    }
}

fun main() {
    println("sha256加密算法")
    val password = "admin888"
    val res = Sha256Run.getSha256(password)
    println(res)
    println(res.length)
    println(res[0].toByte())
}
