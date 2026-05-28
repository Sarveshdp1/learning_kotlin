fun main(args: Array<String>) {

    // unlabeled

    // while loop
    var n1 = 4
    while (n1 > 0) {
        n1--
        if (n1 == 2) continue
        print("$n1 ")
    }

    // do-while loop
    var n2 = 4
    do {
       n2--
       if (n2 ==3) continue
       print(n2)
    } while (n2 > 0)

    // for loop
    for (i in 1..10) {
        if (i == 3) {
            continue
        }
        println(i)
    }

    println("\nlabeled")

    // labeled
    // while loop
    var num1 = 4
    outer@ while(num1 > 0) {
        num1--
        var num2 = 4
        inner@ while(num2 > 0) {
            if (num1 == 2) continue@outer
            println("num1 = $num1, num2 = $num2")
            num2--
        }
    }

    // do-while loop

    var numm = 4
    outer@ do {
        numm--
        var num2 = 4
        do {
            if (numm <= 2) continue@outer
            println("num1 $numm, num2 $num2")
            num2--
        } while (num2 > 0)
    } while (numm > 0)

    // for loop
    outer@ for (i in 4 downTo 0) {
        for (j in 4 downTo 0) {
            if (i <= 3) continue@outer
            println("i: $i, j: $j")
        }
    }
}
