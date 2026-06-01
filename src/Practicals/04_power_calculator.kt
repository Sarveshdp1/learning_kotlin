package Practicals

fun main(args: Array<String>) {

    // nested functions creation and calling

    // extension function on Int
    fun Int.addition(a:Int):Unit {
        return print(a + this)
    }
    45.addition(5)

    // normal function
    fun powercal(num:Int, power:Int): Int {
        var x = 1
        for (i in 1..power) {
            x *= num
        }
        return x
    }
    println(powercal(2,6))

    // lambda extension function
    val power: Int.(Int) -> Int = {num:Int, power:Int -> var x = 1; for (i in 1..power) { x *= num }; x }
    println(2.power(6))
}