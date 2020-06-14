import java.util.HashMap

typealias BuildFn<K, V> = HashMap<K, V>.() -> Unit
typealias ResType<K, V> = Map<K, V>

fun <K, V> buildMap(build: BuildFn<K, V>): ResType<K, V> {
    val map = HashMap<K, V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
