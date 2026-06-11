package c05_functions// higher order function are functions which accepts functions as parameters or returns functios

// lambda function accept Int parameter and return Unit
val aligibility = {a:Int -> if (a>=18) println("congratulations you are eligible"); else println("not eligible")}

// lambda function which return unit
val lam = {println("Hello")}

// lambda function which takes two Int parameters and return Int
var addition = {a:Int, b:Int -> a+b}

// higher-order function accept function which accept no parameters and return Unit
fun higherOrder(a:() -> Unit) {
    a() // invoke/call the kt05_functions.lam function by passing no parameters
}

// higher-order function accept function which accept Int and returns Unit
fun higherOrderInt(a:(Int) -> Unit) {
    a(25) // invokes the lambda expression by passing parameters
}

// higher-order function accepts two parameter one is int and 2nd is function
fun higherOrderinput(value:Int, a:(Int) -> Unit) {
    a(value)
}

// higher-order function accept function which returns Int
// this higher-order function it-self return unit
fun higherOrderAddition(a:(Int, Int) -> Int) {
    val result = a(5,2)
    println("Addition of 5 and 2 is $result")
}

// accept one parameter and return kt05_functions.factorial of the num (Int)
fun facto(num:Int): Int {
    var result = 1
    for (i in num downTo 1) {
        if (num <= 1) return num
        else result *= i
    }
    return result
}

// accept two parameters 1.Int 2.function and return Unit
fun higherOrderFacto(num: Int, func:(Int) -> Int) {
    val result = func(num)
    println("kt05_functions.factorial of $num is $result")
}

// normal function which takes single Int parameter and return Int value
fun fibo(num:Int): Int {
    return if ((num == 1) || (num == 2)) 1
    else fibo(num-1) + fibo(num-2)
}

// higher-order function which returns function which takes single Int type parameter and return Int value
fun higherOrderFibo(): ((Int) -> Int) {
    return ::fibo
}

fun main() {

    // calling higher-order function

    // kt05_functions.lam is a lambda with no parameters and Unit return type,
    // matching kt05_functions.higherOrder parameter type
    higherOrder(lam)

    // because the kt05_functions.higherOrder function only accepts no parameter () function the {} which creates another lambda which return's the unit which is what the kt05_functions.higherOrder parameter needs a function that returns unit
    higherOrder { aligibility(25) }

    // here the parameters for the lambda function is defined in the kt05_functions.higherOrderInt function so while the kt05_functions.higherOrderInt calls the kt05_functions.aligibility lambda function it passes the Int argument to lambda function parameters
    higherOrderInt(aligibility)

    // calling kt05_functions.aligibility lambda function which add 2 numbers and return Int using higher-order function
    higherOrderAddition(addition)

    // calling the higher-order function and passing the arguments for kt05_functions.aligibility lambda function
    higherOrderinput(20,aligibility)

    // calling the higher-order function and passing the argument for kt05_functions.factorial normal function
    // :: is used to make/reference a function as a value so it can be passed as parameter but lambda is a function value so we don't need it for lambda
    higherOrderFacto(5,::facto)

    // it calls kt05_functions.higherOrderFibo function which returned the kt05_functions.fibo normal function soo work this variable is now can be used to call kt05_functions.fibo function
    val fibocall = higherOrderFibo()
    // calling kt05_functions.fibo function and passing argument then it returned Int value which is stored in result variable
    val result = fibocall(6)
    // printing the value of result variable using println function
    println("kt05_functions.fibonacci of 6 is $result")
}