package c00_practicals

fun main() {
    // kt05_functions.fibonacci

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

    // multiplication table
    print("Enter Number: ")
    val inputnum = readLine()!!.toInt()
    var x = 1
    while (x <= inputnum) {
        println("$inputnum x $x = ${inputnum * x}}")
        x++
    }

    // traversing array using iteration
    val studentNames:Array<String> = arrayOf("John", "Denial", "Neo")
    var i = 0
    do {
        println("List of Students: ${studentNames[i]}")
        i++
    } while (i in studentNames.indices)
}