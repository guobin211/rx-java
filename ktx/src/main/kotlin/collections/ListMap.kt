package collections

/**
 * @author guobin211
 * @version 0.0.1
 */
class ListMap {

    private val hashMap = mutableMapOf<String, List<String>>()

    companion object {
        const val COMMENTS = "伴生对象"

        fun printAll(string: Collection<String>) {
            for (s in string) print ("$s ")
            println()
        }
    }

    fun getPerson(name: String): List<String> {
        return this.hashMap[name].orEmpty()
    }

    override fun toString(): String {
        print("ListMap {}")
        return super.toString()
    }

}

fun main() {
    val arr = listOf<String>("one", "two", "three")
    ListMap.printAll(arr)

    val listMap = ListMap()
    val listMap2 = ListMap()
    val res = listMap.getPerson("jack")
    print(res.size)
    print(listMap2)
    // equals
    print(listMap == listMap2)
    print(listMap === listMap2)

}
