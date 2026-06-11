package c00_practicals

import java.util.Scanner

fun main(args: Array<String>) {
    // Kt01_Fundamentals.sum of 3 numbers
    val num1: Double = 44.3
    val num2: Double = 544.3
    val num3: Int = 65
    val sum: Double = num1+num2+num3
    println("Sum of 3 numbers $sum")

    // CGPA Calculator
    println("Enter Marks of Subjects")
    print("Math: ")
    val math: Float = readLine()!!.toFloat()
    print("Java: ")
    val java: Float = readLine()!!.toFloat()
    print("Kotlin: ")
    val kotlin: Float = readLine()!!.toFloat()
    val CGPA: Float = (((math+java+kotlin)/3)/10)
    println("The CGPA is: $CGPA")

    // String Greeting
    print("Enter your name: ")
    val name:String = readLine()!!
    println("Hello $name, Have a good day")

    // Convert km to mile
    print("Enter Km: ")
    val km: Double = readLine()!!.toDouble()
    val toMile: Double = (km * 0.621371)
    println("Km to mile conversion of $km km is $toMile mile")

    // check operator is !is
    val n1 = 54
    when (n1) {
        is Int -> println("$n1 is an Int")
        else -> println("$n1 is not an Int")
    }

    // what will the output
    val calcu: Float = (7f/4f)*(9f/2f) // 7.875
    println(calcu)

    var grade: Char = 'A'
    grade += 8
    println("Encrypted Grade: $grade")
    grade -= 8
    println("Decrypted Grade: $grade")

    var scan = Scanner(System.`in`)

    // is entered number is greater than 5 ?
    print("Enter a number: ")
    val num:Int = scan.nextInt()
    val greater: Boolean = num > 5
    println("The entered number $num is greater then 5 ? $greater")

    // formula sol
    val v = 5f
    val u = 8f
    val a = 3f
    val s = 4f
    val formula:Float = ((v*2f)-(u*2f))/(2f*a*s)
    println("Result is $formula")

    // value of given expression
    val a1 = 7
    val b1 = 7*49/7 + 35/7
    println("Result is $b1")
}