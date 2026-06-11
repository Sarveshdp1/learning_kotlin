package c05_functions// normal, anonymous, lambda, higher-order all these functions are treated as objects so compiler creates memory for individual which can leads to performance drop
// the inline keyword tells the compiler to not create separate memory for each function instead copy the function body code to where it called from
// so using the inline function we are only using the memory of the function which called the other function like a Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function and not creating individual memory for the functions we called
// inline function is recommended for higher-order function because it gives little to no benefit in other functions

// creating inline function
val facto = { num:Int ->
    var x = 1
    for (i in num downTo 1) {
        x *= i
    }
    println("Factorial of $num is $x")
}

// inline higher-order function
// calling kt05_functions.facto lambda function and copying the code to Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function for execution
inline fun higherOrderFacto(n:Int, f:(Int) -> Unit) {
    f(n)
}

// non-local control flow return
inline fun nonLocal(a:() -> Unit, b:() -> Unit) {
    a()
    b()
}

// kt05_functions.crossinline keyword
// inline function allows lambda to return but it exites the higher-order function as-well
// so crossline keyword is used in parameter declaration to decide whether which parameter lambda function not allowed to use return
// but the lambda is still an inline function

// noinline keyword modifier
// if we don't want some parameter lambda not to pass as inline we can use noinline keyword like kt05_functions.crossinline keyword
inline fun crossinline(crossinline a:() -> Unit, noinline b:() -> Unit ) {
    a() // not allowed to use return
    b() // not an inline lambda
}

// reified modifier
// used to access the type of the parameter passed in the function during call
inline fun <reified T> reifiedType(a: Any): Unit {
    if (a is T) println("Correct type")
    else println("Incorrect type")
}

// inline property
// basically a global variable but an inline variable
val age: Int
    inline get() = 20


fun main() {
    print("Enter Number: ")
    val n = readln().toInt()
    higherOrderFacto(n,facto) // higher order inline function copy the kt05_functions.facto lambda code to Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function and execute it here

    // calling reified type check modifier
    reifiedType<String>("Sarvesh") // correct type
    reifiedType<Int>(54.3f) // wrong type

    // calling inline property / inline variable
    println(age)

    // because lambda don't allow return we are using inline function which allows to return
    // directly passing the lambda function via parameter without creating it outside the Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function
    // lambda return can be only define in inline function call but we cant create inline lambda function we have to use higher-order inline function
    nonLocal(
        {print("Hello") // 1st parameter function
        return }, // return need to be in next line
        // exited the higher-order function
        {print("World")} // 2nd parameter function
    )

    // next statement will not execute because the previous call which has lambda return, returned/exited the Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function
    // this happened because the lambda return returns the function in which the lambda is executed
    // when the kt05_functions.nonLocal function has called which is an inline function it copied the body of that function and executed the code in the Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function mean the function who called the inline function
    // so basically it copied the exact lamba and created as local lambda {print("hello"); return}, {print("world")} when executed in Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function the return statement retuned the Kt01_Fundamentals.kt02_DataTypes.kt03_conditional_expression.kt04_loops.kt05_functions.kt06_collection.kt07_object_oriented_programming.main function as well and program ended
    crossinline({print("Hello")
                //return // compilation error return is prohibited here
        },
        {print("World")})


}