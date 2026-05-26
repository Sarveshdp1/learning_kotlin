// function recursion happens when the function calls it-self which is called recursive function

/*
- recursive function calls the function it-self till the condition become true and store the function calls in stack memory
- then while return it come in reverse order and do the operation which were waiting while the function is calling it-self
 */

// factorial
fun factorial(num: Int) : Long {
    var result:Long = 0
    if (num == 1) return 1.toLong()
    else {
        result = num * factorial(num -1).toLong()
    }
    return result
}

// fibonacci
fun fibonacci(num: Int):Long {
    return if ((num == 1) || (num == 2)) {
        num.toLong()
    } else {
        fibonacci(num - 1) + fibonacci(num - 2)
    }
}

// sum of array elements
fun sumArray(args: Array<Int>, index: Int): Int {
    return if (index <= 0) {
        0
    } else {
        sumArray(args, index -1) + args[index -1]
    }
}

fun main() {
    println(factorial(5))
    println(fibonacci(6))

    var arg = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println(sumArray(arg, arg.size))
}