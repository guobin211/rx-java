fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}

class DateRange(private val start: MyDate, private val endInclusive: MyDate) {
    // 重写操作符 in
    operator fun contains(item: MyDate): Boolean = item in start..endInclusive
}