package encryption

/**
 * Util
 * ktx
 * @author guobin211
 * @date 2019/11/21 at 9:44 下午
 * @version 0.0.1
 */
object Util {
    /**
     * 转16进制
     */
    fun toHex(byteArray: ByteArray): String {
        with(StringBuilder()) {
            byteArray.forEach {
                val hex = it.toInt() and (0xFF)
                val hexString = hex.toString(16)
                if (hexString.length == 1) {
                    this.append("0").append(hexString)
                } else {
                    this.append(hexString)
                }
            }
            return this.toString()
        }
    }
}
