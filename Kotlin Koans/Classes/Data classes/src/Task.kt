data class Person(val name: String
, val age: Int) {
    override fun equals(other: Any?): Boolean {
        return name == ((other as Person?)?.name)  && age == ((other as Person?)?.age)
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}