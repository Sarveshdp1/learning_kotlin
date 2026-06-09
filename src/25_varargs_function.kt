// varargs (variable arguments) it allows to store variable number of argument of same type
// uses array to store values

fun sumOfVarargs(vararg a:Int): Int {
    var result = 0
    for (i in a.indices)
        result += a[i]
    return result
}

fun main() {
    val sum = sumOfVarargs(10,5,25,10,15)
    println(sum)
}