import TimeInterval.*
// 枚举
enum class TimeInterval { DAY, WEEK, YEAR }
// 包装类
class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
// 重载操作符 *
operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
// 重载操作符 +
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)
// 重载操作符
operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
   return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
