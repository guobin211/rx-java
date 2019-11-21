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

    /**
     * 获取路径下的文件夹和文件
     */
    fun readPath(path: String): FilePath {
        val fileTreeWalk: FileTreeWalk = File("/").walk()
        val dirs = mutableListOf<String>()
        val files = mutableListOf<String>()
        fileTreeWalk.maxDepth(1).forEach {
            if (it.isDirectory) {
                dirs.add(it.absolutePath)
            } else {
                files.add(it.absolutePath)
            }
        }
        return FilePath(files, dirs)
    }
}

data class FilePath(val files: List<String>, val dirs: List<String>) {}

fun main() {
    println(FileRun.getDirname())
    println(FileRun.getResources())
    val filePath = FileRun.readPath("/")
    val dirs = filePath.dirs
    val files = filePath.files

    files.forEach{
        println(it)
    }

    dirs.forEach{
        println(it)
    }
}
