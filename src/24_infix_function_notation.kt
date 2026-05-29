// infix notation is used in function so we can also call those function without using "()" parenthesis and "." dots
// like and operators function we can call .and() directly using and (these are standard library defined infix notation functions)
// 2 types of infix notation functions 1.library, 2.user-defined
// infix notation function can only be created inside a class (member/extension function) and can only contain single parameter and no default value


// created a class named math
class math {
    // created single parameter infix notation function as member function
    infix fun factorial(a:Int):Int {
        var result = 1
        for (i in a downTo 1) {
            result *= i
        }
        return result
    }
}

class typeCheck {
    infix fun dataType(a:Any): String {
        return when (a) {
            is String -> "String"
            is Short -> "Short"
            is Int -> "Int"
            is Long -> "Long"
            is Float -> "Float"
            is Double -> "Double"
            is Array<*> -> "Array"
            else -> "Char"
        }
    }
}

fun main() {
    // standard library infix notation .and()
    val math = 85
    val java = 75
    // using parentheses and dot
    if ((math > 40).and(java > 40)) println("Pass"); else println("fail")
    // using infix notation
    if ((math > 40) and (java > 40)) println("Pass"); else println("fail")

    // created object for math class
    val mathClass = math()
    // called factorial function using infix notation
    val result = mathClass factorial 3
    println("Factorial of 3 is $result")
    println("Factorial of 5 is ${math() factorial 5}")

    // creating object for typeCheck class
    val checkType = typeCheck()
    println("DataTpe of 25.43f is ${checkType dataType 25.43f}")
    println("DataType of Sarvesh is ${checkType dataType "Sarvesh"}")
    val a = Array(10, {'f'})
    println(checkType dataType a[2])
}