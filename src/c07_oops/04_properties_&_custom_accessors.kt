package c07_oops

import java.util.Scanner

// encapsulation - bundling properties and functions to-gather in single unit the class

// properties in class are the variables which are called properties in class with extra feature (getter and setter)
// properties generates getter and setter automatically
// val - generates only getter as it is read-only
// var - generates both getter and setter as its mutable

// custom setter
// value is assign to field only when the condition meets else no value passes to field
class AndroidSupport {
    var androidVersion: Int = 0
        get() = field
        set(value) {
            if (value > 11) field = value
            else println("android version is outdated\n\tplease update to newer version\n")
            // field will stay 0 if the value is < 11 as the value is not assigned to field
        }
}

// custom getter
// here the field have no value its empty boolean but the getter returns a boolean value
// its like getting a value without assigning value to the property
class ValueMatching(val num1:Float, val num2:Float) {
    val result: Boolean
        get() = num1 == num2
}

fun main() {
    print("Enter your device android version: ")
    val aVer = readln().toInt()
    val checkSupport = AndroidSupport()
    checkSupport.androidVersion = aVer
    println("android version is ${checkSupport.androidVersion}")
    println()

    // scanner class object for user-input
    val scan = Scanner(System.`in`)

    print("Enter num1: ")
    val n1 = scan.nextFloat()
    print("Enter num2: ")
    val n2 = scan.nextFloat()
    val checkMatch = ValueMatching(n1, n2)
    val isMatched = checkMatch.result
    println("%s".format(if (isMatched) "Matched" else "Not Matched"))
}

