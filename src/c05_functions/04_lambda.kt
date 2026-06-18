package c05_functions

// lambda function is store inside a variable as an expression
// lambda return will exit the whole function not only it-self

// sum of 2 num
val sum1 = {a:Int, b:Int -> a+b}

/*
- sum of 3 num
- Int after -> is return type
- explicitly declared data type
 */
val sum2: (Int, Int, Int) -> Int = {a,b,c -> a+b+c}

// sum of array elements using lambda expression function
val sumOfArray = {a:Array<Int> -> var x = 0; for (i in 0..a.size-1) { x += a[i] }; println(x)}

// lambda as class extension
val lambdaAsClass: String.(Int) -> String = { this + it } // "this" string input and "it" Int input both are parameters

fun main() {
    val name = {println("Hello Sarvesh")}
    name()
    name.invoke() // invoke is used to call the object as a function because in kotlin functions are object

    val n1 = 5
    val n2 = 5
    val n3 = 2

    // sum of nums
    println(sum1.invoke(n1, n2))
    println(sum2.invoke(n1,n2,n3))

    // sum of array element
    val arr:Array<Int> = arrayOf(1,2,3,4)
    println(sumOfArray.invoke(arr))

    // lambda as class extension
    val result = "Sarvesh's age is ".lambdaAsClass(20)
    println(result)

    val arr1 = arrayOf(3,-5,54,24,-35,42,-65)
    // lambda using single parameters
    println(arr1.filter { it > 0 })
    // lambda using longhand form
    println(arr1.filter { positivenum -> positivenum > 0 })


    // lambda function return
    val arr2 = arrayOf(1,2,3,4,5)
    arr2.forEach { i -> if ( i == 3) return ; println(i) }
    print("hello word") // on the 3 the return exit the main function so the print function never runs so it's important to use labeled return
}