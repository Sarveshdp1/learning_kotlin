// when expression is also can be used as statement
// its like the switch case in java
// when don't need any break statement at the end
fun isOdd(num: Int) = num % 2 != 0
fun isEven(num: Int) = num % 2 == 0

fun yesOdd(x: Int): Boolean { return if (x % 2 != 0) true else false }
fun yesEven(x:Int): Boolean { return x % 2 == 0 }

fun main(args: Array<String>) {

    // when statement with else branch
    print("Enter Name of Student: ")
    val name = readLine()!!.toString()
    when(name) {
        "Sarvesh" -> println("Roll no. of $name is 146")
        "Siddique" -> println("Roll no. of $name is 154")
        "Sameer" -> println("Roll no. of $name is 138")
        else -> println("Invalid Input")
    }

    // when statement without else branch
    print("Enter roll no: ")
    val rollno: Int? = readLine()?.toIntOrNull()
    when(rollno) {
        146 -> println("$rollno is Sarvesh")
        138 -> println("$rollno is Sameer")
        154 -> println("$rollno is Siddique")
    }

    // when as expression
    println("Enter today date: ")
    val date:Int? = readLine()?.toIntOrNull()
    val day = when (date) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Input"
    }
    println("today date is $date and day is $day")

    // multi line when
    print("Enter any word: ")
    val input1 = readLine()!!
    when(input1) {
        "mars","earth","moon","pluto","saturn" -> println("$input1 is a Planet")
        "monday","tuesday","wednesday","thirsday","friday","saturday","sunday" -> println("$input1 is a day")
        else -> println("Invalid Input")
    }

    // range in when statement if the value is in the range then the in operator returns true and if the values is not in the range then the !in operator returns true
    // in 1..100
    // !in 1..100
    print("Enter month number: ")
    val monthnum:Int? = readLine()?.toIntOrNull()
    when (monthnum) {
        in 1..3 -> println("$monthnum is between jan to mar")
        in 4..6 -> println("$monthnum is between apr to jun")
        in 7..9 -> println("$monthnum is between jul to sept")
        in 10..12 -> println("$monthnum is between oct to dec")
    }

    // check type of variable data using is and !is operator
    val check = "hello world"
    when (check) {
        is Int, is Long, is Short, is Byte -> println("$check is an Integer")
        is Float, is Double -> println("$check is an Floating-point")
        is String -> println("$check is a String")
        is Boolean -> println("$check is a boolean")
    }

    // when can also use function as condition
    print("Enter Number: ")
    val number:Int = readLine()!!.toInt()
    when {
        yesOdd(number) -> println("$number is ODD")
        yesEven(number) -> println("$number is EVEN")
    }
}