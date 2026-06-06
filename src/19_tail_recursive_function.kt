/*
- tail recursion is same as normal recursion, it mostly don't store the function calls on the stack memory so it never get stack overflow error
- in tail recursion the function call should be the last operation
- tailrec keyword is mandatory to tell the compiler to optimize it into a loop
 */
tailrec fun factorial(num: Int, x: Int): Int {
    return if (num == 1) x
    else factorial(num-1, x*num)
}

// sum of array elements
tailrec fun sumOfArray(arr: Array<Int>, index: Int, x: Int = 0): Int {
    return if (index == 0) {
        x
    }
    else {
        sumOfArray(arr, index-1, x+arr[index-1])
    }
}

// fibonacci
tailrec fun fibonaccitail(num: Int, previous:Int = 0, current:Int = 1) : Int {
    return if (num == 1) current
    else fibonaccitail(num-1, current, previous+current)
}

fun main() {
    println(factorial(5))

    val a: Array<Int> = arrayOf(1, 2, 3)
    println(sumOfArray(a, a.size))

    println(fibonaccitail(6))
}