package c01_fundamentals

fun sum(a:Int, b:Int):Int {
    return a+b
}

fun main() {
    // not in expression mean by declaring variable or assigning value to variable or class declaration
    // expression mean a value which is returned
    var a = 5
    var b = 3
    var sum = sum(a,b)
    var multi = a*b
    println("Kt01_Fundamentals.sum of a+b: $sum")
    println("Multiply of a*b: $multi")

    //if expression in kotlin if is also an condition and expression used in variable for a value
    var isgreat = if (a<b) a else b // 5<3 = false
    println(isgreat)

    // Statement
    // declaring a variable , assigning value to variable is called statement
    val marks = 90 // declaring variable
    val sum1 = 23 + 50 // assigning value

    // multi statement
    // you can define multiple statement in single line using ;
    println("Hello") ; print(" My name is Sarvesh")
    val ms1 = 5 ; val ms2 = 10

    var myvar = 5

    fun hello(a:Int):Int {
        return myvar+a //using variable of outside the block
    }
    println("using variable outside the block: ${hello(5)}")

    fun hello2(a:Int) :Int {
        val myvar = 55 // variable nested scope created with same name of outside the block (myvar)
        return myvar+a
    }
    println("variable nested scope: ${hello2(55)}")
}