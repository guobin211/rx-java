// Return the sum of prices for all the products ordered by a given customer
// 求订单总价
// 客户 -> 订单list -> 产品list -> 求和
fun moneySpentBy(customer: Customer): Double =
        customer.orders.flatMap { it.products }.sumByDouble { it.price }
