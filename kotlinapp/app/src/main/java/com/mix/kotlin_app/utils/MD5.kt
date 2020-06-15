package com.mix.kotlin_app.utils

import java.io.UnsupportedEncodingException
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

/**
 * com.mix.kotlin_app.utils
 * MD5.kt
 * @Date 2020-06-15
 * @Author GuoBin<guobin201314@gmail.com>
 * @Project kotlin-app
 */

/**
 * ByteArray 转 hexString
 */
fun toHexString(paramArrayOfByte: ByteArray): String {
    val localStringBuilder = StringBuilder()
    val i = paramArrayOfByte.size
    for (j in 0 until i) {
        var k = paramArrayOfByte[j].toInt()
        if (k < 0) k += 256
        if (k < 16) localStringBuilder.append("0")
        localStringBuilder.append(Integer.toHexString(k))
    }
    return localStringBuilder.toString()
}

/**
 * string 转 MD5 string
 */
fun toMd5(paramString: String): String {
    try {
        val localMessageDigest: MessageDigest = MessageDigest.getInstance("MD5")
        localMessageDigest.reset()
        localMessageDigest.update(paramString.toByteArray(charset("utf-8")))
        return toHexString(localMessageDigest.digest())
    } catch (localNoSuchAlgorithmException: NoSuchAlgorithmException) {
        throw RuntimeException(localNoSuchAlgorithmException)
    } catch (localUnsupportedEncodingException: UnsupportedEncodingException) {
        localUnsupportedEncodingException.printStackTrace()
    }
    return ""
}