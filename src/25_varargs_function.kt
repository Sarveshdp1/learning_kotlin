// varargs (variable arguments) it allows to store variable number of argument of same type
// varargs internally stores arguments as an array
// we can use array functions like .indices, .size, .sum etc
// varargs parameter can only be one in a function and must be in the last and if its on first or in middle then use named arguments

// use * spread operator to pass the array elements to the varargs arguments but if using named arguments then no need to used spread operator

// primitive Int array
fun sumOfVarargs(vararg a:Int): Int {
    var result = 0
    for (i in a.indices)
        result += a[i]
    return result
}

// Int and primitive Int array
fun studmarks(rollno:Int, vararg arr:Int) {
    println("RollNo of Student: $rollno")

    for (i in arr) {
        print("$i ")
    }
}

// primitive Int array and Int
fun mulTableOfNum(vararg a:Int, num:Int) {
    for (i in 1..a.size-1) {
        println("$num x $i = ${a[i]}")
    }
}

fun main() {
    // passing variable number of arguments
    val sum = sumOfVarargs(10,5,25,10,15)
    println(sum)

    // using spread operator to pass array elements as arguments
    val marks = intArrayOf(56,76,84,45,90)
    studmarks(26,*marks)
    println()

    // passing regular typed array to primitive varargs
    // needs to convert to primitive IntArray using .toIntArray()
    print("Enter a number: ")
    val num:Int = readln().toInt()
    val mulTable = Array<Int>(11, {it * num})
    mulTableOfNum(num = num, a=mulTable.toIntArray())

    // accepts object standard array and returning list
    fun rollNums(vararg rn:Int?): MutableList<Int> {
        val list = mutableListOf<Int>()
        for (i in rn) {
            list.add(i!!)
        }
        return list
    }
    val rollNumbers = arrayOf<Int>(126,145,176,129,165,192)
    val list = rollNums(*rollNumbers) // becomes mutableList because function returns an mutableList
    println(list)
    list.add(3)

}