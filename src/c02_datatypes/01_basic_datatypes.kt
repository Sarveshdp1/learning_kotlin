package c02_datatypes

/*
- datatype - tells the compiler which type of data is stored inside a variable
- there are 8 diff primitive datatype Byte, Short, Int, Long, Float, Double, Char, Boolean
- there are 2 diff non-primitive datatype String and Array

- category of datatypes
    integer - Byte, Short, Int, Long
    floating-point - Float, Double
    character - Char
    boolean - Boolean

- example of storable value of datatypes
    integer = byte = 123, Short = 123, Int = 123, Long = 5454L
    floats = Float = 23.3F, Double = 43.23
    char = Char = 'A'
    string = String = "SP"
    Bool = Boolean = true, false

- kotlin datatypes can be used like objects
- kotlin does not need to explicitly specify the type of every variable you declare it infers the value automatically called type inference
 */

fun main(args: Array<String>) {

    /* integers
    var myInt = 5
    var my_long = 5555L

    print("Integer ${myInt}")
    print("Long $my_long")

    var b1: Byte = Byte.MIN_VALUE
    val b2: Byte = Byte.MAX_VALUE
    print("Smallest Byte Value $b1")
    print("Biggest Byte Value $b2")

    */

    //datatype assigning data type can be assigned manually/explicitly using :datatype
    // example: var name:String = "Sarvesh"
    val a: Int = 5 // int
    val b: Float = 5.0F // float
    val c: Double = 54.55 // double
    val d: Long = 543443L // long
    val e: Char = 'S' // character
    val f: String = "Sarvesh" // string
    val g = arrayOf(3,1,5) // array


    // F and L are suffix used to define whether its float or long type
}