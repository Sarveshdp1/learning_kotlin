import java.util.Scanner

fun sum(a: Float, b:Float) : Float {
    return a+b
}


fun main(args : Array<String>) {

    var a: Float = 5.22f
    var b: Float = 5.33f
    println("The sum of a and b is: ${sum(a, b)}")

    // readLine() function the !! is to insure the input value is no null
    print("Type your name: ")
    var name : String = readLine()!! // readline can only read String but you can convert it using .toIntOrNull etc
    println("Your Name is $name")


    // Scanner function import java.util.Scanner
    var scan = Scanner(System.`in`) // Created an object for Scanner function

    print("Enter your age: ")
    var age: Int? = scan.nextLine().toIntOrNull()

    println("Your age is $age")

    println("Name is: $name and Age is: $age")


    var age33 = readLine()?.toIntOrNull()?: 0 // this turn null value to 0
    println(age33)

    var umar: Int? = null?:0
    println(umar)
}