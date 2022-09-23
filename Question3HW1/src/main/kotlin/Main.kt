private fun firstFactorial(num: Int): Int {
    if (num < 1) {
        println("Please try with a positive number.")
    }
    var factorial: Int = 1
    for (i in num downTo 2) {
        factorial = factorial * i
    }
    return factorial
}

fun main(args: Array<String>) {
    val num = 8
    println("Factorial of " + num + " is :" + firstFactorial(num))
}