/*
- tail recursion is same as normal recursion, it mostly don't store the function calls on the stack memory so it never get stack overflow error
- in tail recursion while the function calls it-self it also perform the operation which was defined after the function call so it don't need to do that while returning

 */
fun factorial(num: Int, x: Int): Int {
    return if (num == 1) x
    else factorial(num-1, x*num)
}

// sum of array elements
fun sumOfArray(arr: Array<Int>, index: Int, x: Int = 0): Int {
    return if (index == 0) {
        x
    }
    else {
        sumOfArray(arr, index-1, x+arr[index-1])
    }
}

fun main() {
    println(factorial(5))

    val a: Array<Int> = arrayOf(1, 2, 3)
    println(sumOfArray(a, a.size))
}