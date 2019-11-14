package file

import java.io.File

/**
 * FileRun
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 9:23 下午
 * @version 0.0.1
 */
object FileRun {
    /**
     * 获取项目路径
     */
    fun getDirname(): String {
        return File("").canonicalPath
    }

    /**
     * 获取静态资源
     */
    fun getResources(): String {
        return File("").canonicalPath + "/resources"
    }

    fun readFile(fileName: String) {

    }
}

fun main() {
    println(FileRun.getDirname())
    println(FileRun.getResources())
}