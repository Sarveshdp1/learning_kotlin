package c07_oops

// visibility modifiers controls the visibility/access of the class and class members (properties, functions and nested classes) and its constructor

// private - restricts the visibility of the member to the containing class only, member cannot access outside the class
// internal - restricts the visibility of the member to the same module, a module is a set of Kotlin files
// protected - restricts the visibility of the member to containing class and its subclass
// public - makes a member visible to any code, this is the default modifier if not specified

// public by default in kotlin no need to declare as public
class DisplayGreeting(val name:String) {
    fun greet() {
        println("Hello,\n\tIt's $name")
    }
}

// private - does not allow access to members or elements outside the class or scope
/*
 unlike java kotlin allows multiple top-level declaration in same file, the private top-level element can be access by everything else within the same file
 means a private function or class inside a .kt file can be access only inside that .kt file
*/

// private top-level function
private fun studInfo(branch:String, year:Int){
    println("\tBranch - $branch\n\tYear of Admission - $year")
}

// private top-level class
private class CheckOfferAvailable(private var date:Int = 0) {

    // assign value to private property
    fun todayDate(todayDate:Int) {
        date = todayDate
    }

    // print status
    private fun reply() {
        if (date <= 25) {
            println("Offer is available")
        } else {
            println("Offer ended")
        }
    }

    // call private function
    fun isAvailable() {
        reply()
    }
}

// internal - restricts access within module
/*
 module is a group of kt files meaning the folder inside the project folder in which each folder has src folder inside them those folders are the modules, each one has its own purpose
 meaning like this learning_kotlin project has a single module which is the project folder itself
 but multiple modules looks like

 project folder
    app
        src
            a.kt
            b.kt
    network
        src
            a.kt
            b.kt
    database
        src
            a.kt
            b.kt
*/

// internal top-level class
internal class Intro{
    init {
        println("""
            It's Kotlin
                Statically typed
                Compiled to bytecode
                Has features like type inference  
            Thanks
        """.trimIndent())
    }
}

// protected - accessible only within the declaring class and its subclasses
// cannot be declared at the top-level (outer class, function and variable)
open class Branch(val branch:String) {
    protected fun branch() {
        when (branch) {
            "BCA" -> println("Scholarship is available for BCA")
            "BBA" -> println("Scholarship is not available for BBA")
            "BTech" -> println("Scholarship is available for BTech")
            "MCA" -> println("Scholarship is not available for MCA")
            else -> println("No information available about $branch")
        }
    }
}

// subclass
class IsScholarshipAvailable(val caste:String, val b:String) : Branch(b) {
    fun checkAvailability() {

        branch()

        if (caste.equals("open", ignoreCase = true)) {
            println("$caste has 0% Scholarship")
        } else if (caste.equals("obc", ignoreCase = true)) {
            println("$caste has 50% Scholarship")
            } else if ((caste.equals("sc", ignoreCase = true)) || (caste.equals("st", ignoreCase = true))) {
                println("$caste has 100% Scholarship")
        } else {
            println("No information available about $caste")
        }
    }
}

// override protected variable or function using open keyword
open class MyAge {
    protected open val currentAge:Int = 20

    open fun getAge():Int {
        return currentAge
    }
}

// subclass
class UpdateAge(val x:Int) : MyAge() {
    // overriding property (function)
    // override val age:String = "25" cannot override datatype, only value can be overridden
    override val currentAge:Int = x

    // overriding function
    override fun getAge():Int {
        return currentAge
    }
}

fun main() {
    print("Enter your name: ")
    val name = readln()
    print("Enter branch: ")
    val b = readln()
    print("Enter year of admission: ")
    val yr = readln().toInt()
    println()

    // creating object without storing it in variable
    DisplayGreeting("Sarvesh").greet()
    studInfo("BCA", 2024)
    println()

    // creating and storing object in variable
    val offer = CheckOfferAvailable()
    // offer.date = 5 - date property is private cannot access outside class (compilation error)
    offer.todayDate(26)
    offer.isAvailable()

    offer.todayDate(20)
    offer.isAvailable()
    println()

    Intro()
    println()

    IsScholarshipAvailable("ST", "BCA").checkAvailability()
    println()

    println("Old Age - ${MyAge().getAge()}")
    println("Updated Age - ${UpdateAge(25).getAge()}")
}
