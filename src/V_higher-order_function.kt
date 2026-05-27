// higher order function are functions which accepts functions as parameters or returns functios

// lambda function accept Int parameter and return Unit
val aligibility = {a:Int -> if (a>=18) println("congratulations you are eligible"); else println("not eligible")}

// lambda function which return unit
val lam = {println("Hello")}

// lambda function which takes two Int parameters and return Int
var addition = {a:Int, b:Int -> a+b}

// higher-order function accept function which accept no parameters and return Unit
fun higherOrder(a:() -> Unit) {
    a() // invoke/call the lam function by passing no parameters
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

// accept one parameter and return factorial of the num (Int)
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
    println("factorial of $num is $result")
}

fun fibo(num:Int): Int {
    return if ((num == 1) || (num == 2)) 1
    else fibo(num-1) + fibo(num-2)
}

fun higherOrderFibo(): ((Int) -> Int) {
    return ::fibo
}

fun main() {

    // calling higher-order function

    // lam is a lambda with no parameters and Unit return type,
    // matching higherOrder parameter type
    higherOrder(lam)

    // because the higherOrder function only accepts no parameter () function the {} which creates another lambda which return's the unit which is what the higherOrder parameter needs a function that returns unit
    higherOrder { aligibility(25) }

    // here the parameters for the lambda function is defined in the higherOrderInt function so while the higherOrderInt calls the aligibility lambda function it passes the Int argument to lambda function parameters
    higherOrderInt(aligibility)

    // calling aligibility lambda function which add 2 numbers and return Int using higher-order function
    higherOrderAddition(addition)

    // calling the higher-order function and passing the arguments for aligibility lambda function
    higherOrderinput(434,aligibility)

    // calling the higher-order function and passing the argument for factorial normal function
    // :: is used to make/reference a function as a value so it can be passed as parameter but lambda is a function value so we don't need it for lambda
    higherOrderFacto(5,::facto)

    // it calls higherOrderFibo function which returned the fibo normal function soo work this variable is now can be used to call fibo function
    val fibocall = higherOrderFibo()
    // calling fibo function and passing argument then it returned Int value which is stored in result variable
    val result = fibocall(6)
    // printing the value of result variable using println function
    println("fibonacci of 6 is $result")
}