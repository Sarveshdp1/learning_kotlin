// operators are used to do calculations
// operators has 6 types
// Arithmetic + - * / %
// Relational < > <= >= == !=
// Assigment = += -= *= /= %=
// Unary ++ --
// logical && || !
// Bitwise

fun main() {
    // arithmetic
    val a = 5
    val b = 2
    println("Arithmetic: " + (5 + 10))
    println(a.plus(b))

    // Relational
    println("Relational: " + (5 > 10))
    println(a.compareTo(b) < 0) // a>b
    println(a?.equals(b) ?: (b === null)) //  a==b
    println((!(a?.equals(b) ?: (b === null)))) // a!=b

    // Assigment
    var n1 = 5
    var n2 = 555
    println(n1)
    n1 = 10
    println(n1)
    n1 += n2
    println(n1)

    // unary

    var num1 = 55
    print("Increment unary operator: before: " + num1++) // increments after
    println(" After ++ : $num1")
    println("Decrement unary operator: before: $num1: After: " + ++num1) // increments before

    // logical
    val s1 = 2
    val s2 = 5
    val s3 = 22
    val result = false

    println(s1<s2 && s1>s3) // T T = T or F T = F
    println(s1<s2 || s3>s1) // T F = T or F F = F
    println(result.not()) // negation T = F or F = T

    // Bitwise Operator

}