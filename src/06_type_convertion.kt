fun main() {
    // type conversion is used to convert a data type to another type like changing byte into int
    // while converting a floating type to integer the decimal .00 value will not preserve
    // type conversion don't support boolean
    // supports byte short int long float double char
    val a:Int = 44
    val b = a.toLong()
    println(b)
    val c:Int = 269
    val d = c.toByte()  // 269-256=13
    println(d)
    val e: Int = 65
    val f = e.toChar() //A because supports Unicode
    println(f)
}