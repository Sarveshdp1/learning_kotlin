package Practicals

fun main() {
    // fibonacci

    var num = 6

    var a = 1
    var b = 1

    if ((num == 1) || num == 2 ) {
        println(1)
    } else {
        for (i in 3..num) {
            var temp = a + b
            a = b
            b = temp
        }
        println(b)
    }
}