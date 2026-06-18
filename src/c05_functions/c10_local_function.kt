package c05_functions

import java.util.Scanner

// local functions are function inside functions
// its same like normal function
// has access to outer function variables and functions (closure)
// Kotlin does not support inline functions (as of 2026)

fun main() {

    val scan = Scanner(System.`in`)

    print("Enter number: ")
    val num = scan.nextInt()

    // local/nested function
    fun getFibo(num:Int):Int {
        fun getFibonacci(num1: Int = num, a:Int = 0, b:Int = 1):Int {
            println(a)
            return if (0 == num1) b
            else getFibonacci(num1 - 1, a = b, b = a + b)
        }
        return getFibonacci()
    }

    // higher order function
    fun highOrder(n:Int, a:(Int) -> Int) {
        a(n)
    }

    // higher-order function call
    highOrder(num, ::getFibo)
}