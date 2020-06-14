// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.filter {c: Customer ->
            val (delivered, undelivered) = c.orders.partition { it.isDelivered }
            undelivered.size > delivered.size
        }.toSet()
