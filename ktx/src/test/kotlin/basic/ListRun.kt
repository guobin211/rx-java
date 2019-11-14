package basic

/**
 * @author guobin211
 * @date 2019/11/13 at 3:37 下午
 * @version 0.0.1
 */

data class Product(var name: String, var price: Number) {}

fun main() {
    val productList = listOf<Product>(
        Product("IDEA", 399.9),
        Product("WebStorm", 99.7),
        Product("AppCode", 199.5),
        Product("PyCharm", 99.9)
    )

    val res = productList.binarySearch(
        Product("IDEA", 399.9),
        compareBy<Product> { it.price.toFloat() }.thenBy { it.name })

    println(res)

    val colors = listOf("Blue", "green", "ORANGE", "Red", "yellow")
    println(colors.binarySearch("RED", String.CASE_INSENSITIVE_ORDER))

    println(productList.getOrNull(2))
}
