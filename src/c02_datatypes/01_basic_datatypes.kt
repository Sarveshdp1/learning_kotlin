package c02_datatypes/* datatype is used to store data
- datatype is used to store type of the variable data
- there are 4 diff primitive datatype integer, floating-point, boolean, character
- there are 2 diff non-primitive datatype string, array
integer = byte, Short, Int, Long = 5454L
floats = Float = 23.3F, Double = 43.23
string = String = "SP"
Bool = Boolean = True, False
- datatype in kotlin are objects
- kotlin does not need to explicitly specify the type of every variable you declare it infers the value automatically called type inference
 */

fun main(args: Array<String>) {

    /* integers
    var myint = 5
    var my_long = 5555L

    print("Integer ${myint}")
    print("Long $my_long")

    var b1: Byte = Byte.MIN_VALUE
    val b2: Byte = Byte.MAX_VALUE
    print("Smallest Byte Value $b1")
    print("Biggest Byte Value $b2")

    */

    //datatype assigning data type can be assigned manually/explicitly using :datatype
    // example: var name:String = "Sarvesh"
    var a: Int = 5 // int
    var b: Float = 5.0F // float
    var c: Double = 54.55 // double
    var d: Long = 543443L // long
    var e: Char = 'S' // character
    var f: String = "Sarvesh" // string
    var g = arrayOf(3,1,5) // array


    // F and L are suffix used to define whether its float or long type
}