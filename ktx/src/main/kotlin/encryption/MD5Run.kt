package encryption

import java.lang.StringBuilder
import java.security.MessageDigest

/**
 * MD5Run
 * ktx
 * @author guobin211
 * @date 2019/11/20 at 8:34 下午
 * @version 0.0.1
 */
object MD5Run {

    /**
     * MD5加密, 不可逆
     */
    fun getMD5(input: String): String {
        val digest = MessageDigest.getInstance("MD5")
        val res = digest.digest(input.toByteArray())
        with(StringBuilder()) {
            res.forEach {
                val hex = it.toInt() and (0xFf)
                val hexStr = hex.toString(16)
                this.append(hexStr)
            }
            return this.toString()
        }
    }
}

fun main() {
    println("MD5消息摘要")
    val input = "admin888"
    val digest = MessageDigest.getInstance("MD5")
    val res = digest.digest(input.toByteArray())
    println(res)

    val md5 = MD5Run.getMD5(input)
    println(md5)
}
