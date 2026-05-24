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