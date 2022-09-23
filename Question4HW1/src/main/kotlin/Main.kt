private fun questionsMarks(str: String): String {
    var result = "false"
    var qmCount = 0
    var lastDigit = -1


    for (char in str) {
        if (char.isDigit()) {
            val digit = Integer.valueOf(char.toString())
            val sum = digit + lastDigit
            lastDigit = digit

            if (sum != 10) {
                qmCount = 0
                continue
            }

            result = if (qmCount == 3)
                "true"
            else
                "false"
            qmCount = 0
        } else if (char == '?') qmCount++
    }

    return result;
}
fun main() {
    println(questionsMarks(readln()))
}
