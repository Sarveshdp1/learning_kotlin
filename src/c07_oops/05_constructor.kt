package c07_oops

import java.util.Scanner

/*
 constructor is a special member function that called automatically when the object of class is created
 constructor parameters are like function parameters but have different purpose to initialize properties and perform startup operation
 constructor initialize/holds properties in form of parameters
 provides features (default arguments, named arguments, multiple constructors, initializer block)

 constructors have two types
 1. primary - defined inside parentheses after class name
 2. secondary - defined inside class body with constructor keyword

 class can have only one primary constructor but multiple secondary constructors
 we cannot access parameter or body of secondary constructor outside the secondary constructor or class
*/

// primary constructor using varargs parameter
class SumOfNumbers(vararg val numbers:Int) {
    var result = 0
    fun resultOfSum() {
        for (i in numbers) {
            result += i
        }
        println("sum of variable numbers are: $result")
    }
}

// secondary constructor
// it provides a body to perform operations or execute library functions or anything
class FactoOfNum {
    var result = 1
    constructor(num: Int) {
        for (i in num downTo 1) {
            result *= i
        }
        println("Factorial of $num is $result")
    }
}

// multi-secondary constructor
// allows to create multiple secondary constructors in class
// constructors need to have different number or type of parameters
class MultiSecConstructor {
    constructor(firstName: String, lastName: String) {
        println("First Name: $firstName , Last Name: $lastName")
    }

    constructor(clgName: String, year: Int, admissionYear: Int) {
        fun details() {
            println("""
            College Name: $clgName
            Year: $year
            Admission Year: $admissionYear
        """.trimIndent())
        }
        details()
    }
}

// calling secondary constructor from another secondary constructor using this() function keyword
// the this() constructor call executed fully first then the current constructor call is executed later
class CallConstructor {
    constructor(num1: Float, num2: Float, num3: Float) {
        println("Sum of three numbers: ${num1 + num2 + num3}")
    }

    constructor(num1: Int, num2: Int) : this(num1.toFloat(), num2.toFloat(), 6.45f) {
        println("Sum of two numbers: ${num1 + num2}")
    }
}

// calling parent class constructor from child class using super keyword
// open keyword is used to tell the compiler that the class can extend because inheritance is prevented by default
open class Parent {
    constructor(dad: String, mother: String) {
        println("Dad's Name: $dad\nMother's Name: $mother")
    }
}
class Child : Parent {
    constructor(son: String, daughter:String, dad: String, mother: String) : super(dad, mother) {
        println("Son's Name: $son\nDaughter's Name: $daughter")
    }
}

/*
 1. initializer block (init block)
    primary constructor cannot contain any logic ( class cannot execute anything without functions )
    init block used to execute properties or println function at time of object creation
    it executes in order as defined

 2. default parameter values in primary constructor
    uses the values assigned as default if no argument is passed on object creation
*/

// init block and default parameter value
class InitBlock(val name: String, val num: Int = 8) {
    init {
        println("""
            Hello $name, 
                It's Kotlin
                    how are you
        """.trimIndent())
    }

    init {
        println("Multiplication table of 8")
        for (i in 1..10) {
            println("$num x $i = ${i*num}")
        }
    }
}

fun main() {

    // Scanner class object
    val scan = Scanner(System.`in`)

    // user input numbers
    print("Enter num1: ")
    val n1 = scan.nextInt()
    print("Enter num2: ")
    val n2 = scan.nextInt()
    print("Enter num3: ")
    val n3 = scan.nextInt()
    print("Enter num4: ")
    val n4 = scan.nextInt()
    print("Enter num5: ")
    val n5 = scan.nextInt()

    // primitive array
    val arr = intArrayOf(n1,n2,n3,n4,n5)

    // object of SumOfNumbers class passing argument to varargs parameter using named argument
    val sumOfArrayList = SumOfNumbers(numbers = arr)
    sumOfArrayList.resultOfSum()
    println()

    // obj of class which has single secondary constructor
    val factorialClass = FactoOfNum(5)
    println()

    // obj of class which has multiple secondary constructors
    val studPersonalInfo = MultiSecConstructor("Sarvesh", "Patil")
    val studClgInfo = MultiSecConstructor("Raisoni", 3, 2026)
    println()

    // calling first constructor
    val sumOfNums = CallConstructor(5f,3f,54f)
    println()

    // calling constructor using another constructor
    val sumOfNums2 = CallConstructor(6,3)
    println()

    // object of child class
    val parentAndChildInfo = Child(dad = "Pratik", mother = "Rohini", son = "Praro", daughter = "Prahini")
    println()

    // object of class InitBlock which also has default parameter value
    print("Enter your name: ")
    val myName = readln()
    val greet = InitBlock(myName)
}