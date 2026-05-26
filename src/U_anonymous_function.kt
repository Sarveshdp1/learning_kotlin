// anonymous function is a function without name and store inside variable and call using variable name
// anonymous function only return from it-self not the whole function

// find number even or odd and negative or positive
val evenOdd = fun (a: Int): String {
    return if ((a % 2 == 0) and (a > 0) ) "$a is even and positive"
    else if ((a % 2 != 0) and (a > 0)) "$a is odd and positive"
    else if ((a % 2 == 0 ) and (a < 0)) "$a is even and negative"
    else "$a is odd and negative"
}

/*
- sum of 2 numbers
- return as unit
- explicitly datatype declaration
 */
var sum0: (Int,Int) -> Unit = fun(a,b): Unit {
    println("sum of $a + $b is ${a+b}")
}

// sum of 2 numbers and explicitly datatype declaration
var sumf: (Int,Int) -> Int = {a, b -> a+b}

fun main() {

    // calling anonymous function and passing arguments
    println(evenOdd(-35))
    sum0(4,2)
    sum1(5,20)

    val arr = arrayOf(1,2,3,4,5)
    // anonymous function return
    arr.forEach(fun(i:Int) {
        if (i == 3) return
        println(i)
    })
    println("hello") // on 3 the fun will be exited but the loop still continue on 4th and on 4th the fun execute again then print hello
}