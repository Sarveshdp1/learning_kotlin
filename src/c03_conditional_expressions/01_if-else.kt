package c03_conditional_expressions

// if/else statement/expression is used to make decisions on whether a conditions is true or false
// executes if or else-if block when condition is true
// executes else block when all preceding condition is false

fun main(args: Array<String>) {
    val num = 5
    // if statement only execute then if condition is true
    if (num > 1) {
        println("$num the number is greater then 1")
    }

    // if-else the if is executed when true and else is executed when false
    val state: String = "maharashtra"
    val welcomemsg: String = "Welcome to Maharashtra"
    if (state=="maharashtra") {
        println(welcomemsg)
    } else {
        println("Sorry no Entry")
    }

    // if-else expression as a ternary operator
    val a = 50
    val b = 10

    val max = if (a > 5) {
        println("Greater number is: $a")
    } else {
        println("Lesser number is: $b")
    }

    // or
    val max2:Int = if (a > 5) a else b

    println(max2)

    // if-else-if ladder
    print("enter day number: ")
    val day: Int? = readLine()?.toIntOrNull()
    if (day==1) {
        println("Monday")
    } else if (day==2) {
        println("Tuesday")
    } else if (day==3) {
        println("Wednesday")
    } else {
        println("Wrong Input")
    }

    // nested if-else ladder
    val num1 = 55
    val num2 = 20
    val num3 = 90

    val greaterNum: Unit = if (num1 > num2) {
        if (num1 > num3) {
            println("$num1 is Greater then $num2 and $num3")
        } else {
            println("$num3 is Greater then $num1 and $num2")
        }
    } else if (num2 > num3) {
        println("$num2 is Greater then $num1 ane $num3")
    } else {
        println("$num3 is Greater then $num1 and $num2")
    }
    println(greaterNum)
}