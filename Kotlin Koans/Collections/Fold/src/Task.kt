// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts = customers.flatMap { c ->
        c.orders.flatMap {
            it.products
        }
    }.toSet()
    return customers.fold(allProducts, { orderedByAll, customer ->
        orderedByAll.intersect(customer.orders.flatMap { it.products }.toSet())
    })
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products }


fun main() {
    val city1 = City("wuhan")
    val city2 = City("beijing")
    val product1 = Product("kfc", 1.0)
    val product2 = Product("麦当劳", 2.0)
    val product3 = Product("周黑鸭", 3.0)
    val product4 = Product("王老吉", 4.0)
    val order1 = Order(listOf(product1, product2), false)
    val order2 = Order(listOf(product2, product3), true)
    val order3 = Order(listOf(product3, product4), false)
    val order4 = Order(listOf(product4, product1), true)
    val orders: List<Order> = listOf(order1, order2, order3, order4)
    val copy = mutableListOf<Order>()
    copy.add(Order(listOf(Product("麦当劳", 2.0)), false))
    val customer1 = Customer("张飞", city1, orders)
    val customer2 = Customer("赵云", city2, copy)
    val shop = Shop("永辉超市", listOf(customer1, customer2))

    val productSet = shop.getProductsOrderedByAll()

    println(productSet)
}