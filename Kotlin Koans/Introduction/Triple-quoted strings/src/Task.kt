const val question = "life, the universe, and everything"
const val answer = 42

fun String.trimIndent(): String {
    return this.trimMargin("#")
}

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimIndent()

fun main() {
    println(tripleQuotedString)
}