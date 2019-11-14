package encryption

import java.lang.StringBuilder

/**
 * CaesarRun 凯撒加密
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 9:02 下午
 * @version 0.0.1
 */
object CaesarRun {
    /**
     * 偏移量
     */
    private const val OFFSET_KEY = 2

    /**
     * 字符偏移加密
     */
    fun encryption(s: String, key: Int = OFFSET_KEY): String {
        return with(StringBuilder()) {
            s.toCharArray().forEach {
                this.append((it.toInt() + key).toChar())
            }
            toString()
        }
    }

    /**
     * 字符偏移解密
     */
    fun decryption(s: String, key: Int = OFFSET_KEY): String {
        return with(StringBuilder()) {
            s.toCharArray().forEach {
                this.append((it.toInt() - key).toChar())
            }
            toString()
        }
    }
}

fun main() {
    val str = "abc"
    // Char转int
    str.forEach { println(it.toInt()) }
    val encode = CaesarRun.encryption(str)
    println(encode)

    val decode = CaesarRun.decryption(encode)
    println(decode)

}