// 统计出订单最多的客户
// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? =
        customers.maxBy { it.orders.size }

// 两层的统计
// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? =
        customer.orders.flatMap { it.products }.maxBy { it.price }
