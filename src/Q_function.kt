import org.jetbrains.annotations.Nullable

// for sum kotlin has default function named sum called library standard functions like arrayOf() , sum(), rem()
fun sum2(a: Int, b: Int) : Int {
    var c = a+b
    return c
}

fun mul(a:Int , b:Int): Int {
    return a.times(b) // can use .times function as * multiply
}

fun student(name:String, rollNo:Int, div: Char = 'A') {
    println("Name of Student is : $name")
    println("RollNo of Student is : $rollNo")
    println("Division of Student is : $div")
}

// default arguments
fun sayhallo(name: String = "World") {
    println("Hello $name")
}

// for named function calling
fun employ(name:String, age:Int, experience:Int = 2) {
    println("Hello $name")
    when (age) {
        in 18..35 -> println("$age y/o you are young")
        else -> println("$age y/o you are old")
    }
    when (experience) {
        in 0..2 -> println("$experience Years of experience is less you are still a fresher")
        else -> println("$experience Years of experience is great")
    }
}

fun main() {

    // calling user-defined-function
    println(sum2(1, 2))
    println(2.times(5))
    println(mul(3,2))
    println(student("Sarvesh",146,'C'))

    // using build-in standard library functions
    //.rem() function to find the reminder
    println(5.rem(3)) //3*1=3 5-3=2 reminder is 2
    println(sum(5,8)) // can only accepts 2 parameters

    var sumOfArray = arrayOf(22,44,23,54,2,32,55,75).sum()
    println(sumOfArray)

    // calling default arg function
    println(sayhallo())
    println(sayhallo("Sarvesh"))

    // named function calling
    println(employ(age = 24, name = "Sarvesh"))
}