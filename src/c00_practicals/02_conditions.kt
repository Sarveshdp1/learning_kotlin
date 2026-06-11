package c00_practicals

import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    // if marks is above 33 out of 40 then pass else fail
    print("Math: ")
    val sub1 = scan.nextInt()
    print("Python: ")
    val sub2 = scan.nextInt()
    print("Java: ")
    val sub3 = scan.nextInt()

    if (( sub1 in 33..40) && (sub2 in 33..40) && (sub3 in 33..40)) {
        println("Pass")
    } else {
        println("Fail")
    }

    // find the day of the week
    print("Enter day number: ")
    val daynum = scan.nextInt()
    when (daynum) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")
    }

    // leap year calculator
    println("Enter year: ")
    val year = scan.nextInt()

    if ((year % 4 == 0) || (year % 400 == 0)) {
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }
}