// variable is temp storage is used to store value
// val is immutable
// var is mutable
// every variable name convention is using lowerCamelCase only
fun main() {
    val a = 5 // immutable
    //a = 10 error val cannit be reassigned
    var b = 55
    b = 32 // no error
    println("$a, $b")
}