import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    print("Enter Number: ")
    val number = scan.nextInt()
    var factorial = 1
    var num = number

    do {
        factorial *= num
        num--
    } while (num > 0)

    println("factorial of $number is $factorial")

    // table
    var num1 = scan.nextInt()
    var temp = 1
    do {
        println("$num1 * $temp = ${num1 * temp}")
        temp++
    } while (temp < 10)
}