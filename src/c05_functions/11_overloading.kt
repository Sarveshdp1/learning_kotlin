package c05_functions

// function overloading happens when we create a new function with the same name of an existing function
// overloaded function needs different datatype or numbers of arguments than existing function (return type does not affect)

fun myInfo(name:String) {
    println("First Name: $name")
}

/*
Not allowed

fun myInfo(fullName:String) {
    println(fullName)
}
*/

// allowed
fun myInfo(age:Int) {
    println("Age: $age")
}

fun main() {
    myInfo("Gerry")
    myInfo(25)
}