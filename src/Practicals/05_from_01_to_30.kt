package Practicals

import java.util.Scanner

val Scan = Scanner(System.`in`)

// infix member function
class MulTableClass{
    infix fun mulTable(num:Int):Unit {
        var i = 1
        var result = 1
        for (i in 1..10) {
            println("$num x $i = ${num*i}")
        }
    }
}

// normal function
fun powerOf(num: Int, power:Int):Int {
    var i = 1
    var result = 1
    while (i <= power) {
        result *= num
        i++
    }
    return result
}

// lambda function
val factorial = { num: Int ->
    var i = 1
    var result = 1
    while (i <= num) {
        result *= i
        i++
    }
    result
}

// inline higher-order function
inline fun powerAndFactorial(num: Int, power:Int, fn0:(Int, Int) -> Int, fn1:(Int) -> Int) {
    println("\nPower of $num is ${fn0(num, power)}")
    println("\nFactorial of $num is ${fn1(num)}")
}

// anonymous function
val rockPaperScissors = fun(input:String) {
    val bot = (1..3).random()
    if (((input.equals("Scissor", ignoreCase = true )) && (bot == 2 )) || ((input.equals("Paper", ignoreCase = true)) && (bot == 3)) || ((input.equals("Rock", ignoreCase = true)) && (bot == 1))) println("You Won")
    else println("""
        You Loss
        Game Over!
    """.trimIndent())
}

fun main() {

    print("Enter num: ")
    val num1 = Scan.nextInt()
    print("Enter power: ")
    val power = readLine()!!.toInt()

    powerAndFactorial(num1, power, ::powerOf, factorial)

    println("\nMultiplication Table of $num1")
    val multiplicationTable = MulTableClass()
    multiplicationTable mulTable num1

    val Scan2 = Scanner(System.`in`)
    println("\nGame Start")
    print("Enter Rock or Paper or Scissor: ")
    val input = Scan2.nextLine()

    // condition, logical operator, .equals() function and ignore case sensitivity
    if ((input.equals("Scissor", ignoreCase = true)) || (input.equals("Paper", ignoreCase = true)) || (input.equals("Rock", ignoreCase = true))) {
        rockPaperScissors(input)
    } else println("Wrong input")

    // array of string
    val googleEmployeeList = ArrayList<String>()

    print("\nEnter employee 1 name: ")
    val employee1 = Scan2.nextLine()
    googleEmployeeList.add(employee1)

    print("Enter employee 2 name: ")
    val employee2 = Scan2.nextLine()
    googleEmployeeList.add(employee2)

    print("Enter employee 3 name: ")
    val employee3 = Scan2.nextLine()
    googleEmployeeList.add(employee3)

    print("Enter employee 4 name: ")
    val employee4 = Scan2.nextLine()
    googleEmployeeList.add(employee4)

    // labeled break
    outer@for (i in 0..googleEmployeeList.size-1) {
        if (googleEmployeeList[i] == "John") {
            println("\n\tYes John works in Google")
            break@outer
        }
    }

    // .contains() function
    if (googleEmployeeList.contains("Yogesh")) {
        println("\n\tYes Yogesh works in Google")
    } else {
        println("\n\tNo Yogesh not works in Google")
    }

    // traversing
    println("\nHere is the list of Google Employees:")
    for ((i, v) in googleEmployeeList.withIndex()) {
        println("$i $v ")
    }

    // recursive (ascending-order)
    fun multiTable(num:Int, times:Int = 10) {
        if (times == 0) return
        else {
            multiTable(num, times-1)
            println("$num x $times = ${num*times}")
        }
    }

    // tail-recursive (descending-order)
    tailrec fun multiTableTail(num: Int, times:Int = 10) {
        if (times == 0) return
        else {
            println("$num x $times = ${num*times}")
            multiTableTail(num, times-1)
        }
    }
    print("\nEnter a number: ")
    val n = readLine()!!.toInt()
    println("Multiplication Table of $n in Ascending-Order")
    multiTable(n)
    println("\nMultiplication Table of $n in Descending-Order")
    multiTableTail(n)
    println()

    // collections
    // arrayList (dynamic array)
    val androidVersions = ArrayList<Int>()
    androidVersions.addAll(listOf(10,11,12,13,14,15))
    androidVersions.add(16)
    androidVersions.add(17)
    println("Android versions:")
    androidVersions.forEach { print("$it ") }

    println("\n\nOutdated android version: ${androidVersions.min()}")
    println("Latest stable android version: ${androidVersions.max()-1}")
    println("Latest beta android version: ${androidVersions.max()}\n")

    // mutable list
    val furniture = mutableListOf("Bed", "Dining Table", "Sofa", "Wardrobe", "Bookshelf")
    var i = 0

    // traversing list using while loop
    print("Furniture in my House: ")
    while (i <= furniture.size-1) {
        print("${furniture[i]}, ")
        i++
    }
    println("\n")

    // set
    val pocoFSeries = setOf<String>("f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8")

    // traversing set using for loop
    println("F Series of POCO")
    for (i in pocoFSeries) {
        print("$i ")
    }
    println("First POCO F Series Model is : ${pocoFSeries.first()}")
    println("Latest POCO F Series Model is : ${pocoFSeries.last()}")
    println("${pocoFSeries.elementAt(0)} is the legendary device\n")

    // hashset (random order)
    val fruits = hashSetOf<String>()
    fruits.add("Mango")
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Orange")
    fruits.add("Dragon")
    println(fruits)
    println()

    // map
    val companies = mapOf<String, Int>("Microsoft" to 1975, "Apple" to 1976, "Amazon" to 1994, "Infosys" to 1981)

    // traversing map using for loop
    for (i in companies.keys) {
        println("$i is since ${companies[i]}")
    }

    println("\nMicrosoft is since: ${companies.get("Microsoft")}")

    // creating new map of value in range of 1980..2000 using filter lambda function
    println("\nCompanies since between 1980 and 2000 are:")
    val filter = companies.filter { (i , v) -> v in 1980..2000 }
    println(filter)
    println()

    // hashmap
    val laptopBrandsModels = hashMapOf<String, String>()
    laptopBrandsModels.put("Asus", "TUF & ROG")
    laptopBrandsModels["Apple"] = "MacBook Mini & MacBook Pro"
    laptopBrandsModels.set("Lenovo", "IdeaPad & ThinkPad")
    laptopBrandsModels += "Acer" to "Nitro & Predator"

    println(laptopBrandsModels)
    println()

    // traversing hashmap using for-each loop
    laptopBrandsModels.forEach{ key , value -> println("$key has $value")}
}