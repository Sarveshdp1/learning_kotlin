package c04_loops

// break statement - exits loop immediately when the specified condition is met

fun main(args: Array<String>) {
    var num = 1
    val sum = 0

    /* while loop
    while(num<10) {
        Kt01_Fundamentals.sum += num
        if (Kt01_Fundamentals.sum in 25..30) {
            println("Kt01_Fundamentals.sum = $Kt01_Fundamentals.sum")
            break
        }
        num++
    }

    // do-while loop
    var temp = 1
    var kt05_functions.sum2 = 0

    do {
        kt05_functions.sum2 += temp
        if (kt05_functions.sum2 in 11..20) break
        temp++
    } while(temp<10)

    println("kt05_functions.sum2: $kt05_functions.sum2")


    // for loop
    var sum3 = 0
    for (i in 1..10) {
        sum3 += i
        if (sum3 in 25..30) {
            break
        }
    }
    println("iterated process: $sum3")

    var planet = arrayOf("Earth", "Mars", "Jupiter", "Saturn")
    var lol = 0
    do {
        if (planet[lol]=="Jupiter") {
            println("Jupiter")
            return
        }
        lol++
    } while(lol<=planet.size-1)


     */


    // tagged break
    it@ for (i in 1..10) {
        for (j in 1..10)
            print(j)
        if (i == 5) {
            break@it
        }
        println()
    }

    var num1 = 1
    hello@while (num1 < 5) {
        num1++
        println()
        var num2 = 1
        while (num2 < 5) {
            num2++
            if (num1 == 3) break@hello
            print(num2)
        }
    }

    var numm1 = 1
    lol@ do {
        numm1++
        var num2 = 1
        do {
            num2++
            print(num2)
            if (numm1 == 3) break@lol
        } while (num2 < 5)
        println()
    } while (numm1 < 5)
}
