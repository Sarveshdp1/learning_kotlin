package c07_oops

// inheritance - it allows class to define a new class (sub/child/derived class) based on the existing class (super/parent/base class)
// derived class inherits all properties and functions of the super class except private, meaning it can access and override the inherited members and can also create new one

// inheritance is the most important concept Object-Oriented Programming it help in code reusability and clean code
// allows all the features of the superclass to be inherited by the subclass, in addition the derived class can add some features of its own

// in Kotlin all the class are final. To permit the derived class to inherit from base class, we must use open keyword in front of base class

// Superclass (Parent Class) - baseclass contains the characteristic and features that can be overridden by the subclass
// Subclass (Child Class) - A class that is derived from another class and thus gets to inherit properties and function from that original class

// we can use or access the properties (variables) and functions of the baseclass in derived class and can also call the function of baseclass
// we cannot access the subclass members in baseclass

open class Base (val name:String) {

    // .also{} function allows to perform operation like println() while initializing / assigning value
    // it executes lambda block as a side effect on the value and returns the same value for assignment
    open val size:Int = name.length.also { println("Numbers of characters in $name are $it") }
    /*
       as we have created a subclass and overridden the size variable, so when the size variable is called it tries to
       access the subclass overridden variable which is not even initialized yet because the subclass or its members
       cannot execute or initialize before the base class so the variable still contains 0 integer value because for
       Int default JVM value is 0 and here Kotlin documentation warns us to not access override members on object initialization because of situation like this

       This situation is called - (override initialization trap)
    */

    // because of the override size variable the mulTable variable will receive 0 Int value

    // to solve this problem we will create a new variable with same value
    private val baseSize = name.length

    val mulTable:Int = baseSize.also {
        x -> println("Multiplication Table of $baseSize")
        for (i in 1..10) println("$x x $i = ${x * i}")
    }
}

class Sub(name: String, lastName: String) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Arguments for Baseclass: $it") }) {

    override val size:Int =
        (super.size + lastName.length).also { println("Total Numbers of characters in ${super.name}$lastName are $it")}
}


// creating baseclass for employees which contains common employee details and multiple subclasses that add their own specialized features
// baseclass
private open class Employee(name:String , age:Int, salary:Int, prevCompany:String) {
    init {
        println("""
            Personal Details of Employee:
                Name: ${name.replaceFirstChar{it.uppercase()}}
                Age: $age
                Salary: Rs.$salary LPA
                Previous Company: $prevCompany
        """.trimIndent())
    }
}
// subclass 1
private class WebDeveloper(name:String, age:Int, salary:Int, prevCompany:String) : Employee(name,age,salary,prevCompany) {
    fun webDevIntro() {
        println("""
            
            Hello Everyone,
                I'm a Web Developer
                I have 3 years of experience
        """.trimIndent())
    }
}
// subclass 2
private class AndroidDeveloper(name:String, age:Int, salary:Int, prevCompany:String) : Employee(name,age,salary,prevCompany) {
    fun androidDevIntro() {
        println("""
            
            Hello Everyone,
                I'm an Android App Developer
                I have 5 years of experience
        """.trimIndent())
    }
}
// subclass 3
private class IOSDeveloper(name:String, age:Int, salary:Int, prevCompany:String) : Employee(name,age,salary,prevCompany) {
    fun iosDevIntro() {
        println("""
            
            Hello Everyone,
                I'm an IOS App Developer
                I have 1 year of experience
        """.trimIndent())
    }
}
// subclass 4
private class WindowsSoftwareDeveloper(name:String, age:Int, salary:Int, prevCompany:String) : Employee(name,age,salary,prevCompany) {
    fun windowsSoftwareDevIntro() {
        println("""
            
            Hello Everyone,
                I'm a Windows Software Developer
                I have 15 years of experience
        """.trimIndent())
    }
}

// inheritance primary constructor
private open class Movie(val name:String) {
    open fun printInfo() {
        println("The Movie $name is a great movie")
    }
}

private class Director(movieName:String, val directorName:String) : Movie(movieName) {
    override fun printInfo() {

        super.printInfo()

        println("\tIt's Directed by $directorName")
    }
}

// inheritance secondary constructor
private open class OldMembers {
    constructor(newMem1: String, newMem2: String, newMem3: String) {
        println(
            """
            List of Old Members of House:
                Member 1: $newMem1
                Member 2: $newMem2
                Member 3: $newMem3
            
        """.trimIndent()
        )
    }
}

private class NewMember : OldMembers {
    constructor(oldMem1: String, oldMem2: String, oldMem3: String, newMem1: String, newMem2: String) : super(oldMem1, oldMem2, oldMem3) {
        println(
            """
            List of New Members of House:
                Member 1: $newMem1
                Member 2: $newMem2
            
        """.trimIndent()
        )
    }
}

// Overriding Functions and Properties
// we use overriding when we need to declare a new function with same (name of function, numbers of arguments, type of arguments, return type of function) in subclass while it already exist in the baseclass
// to allow the member for overriding we must declare it using open keyword
// to override the member we must declare it using override keyword
private open class Detail {
    open val name:String = "Manish"

    open fun intro() {
        println("""
            Hello It's $name,
                How are you guys doing!
        """.trimIndent())
    }
}

// calling the super class implementation (original not overridden)
// we can also access the baseclass property and call the function in subclass using super keyword with dot notation (super.name or super.run(a,b))
private class Details2 : Detail() {
    override val name:String = "Rohit"

    override fun intro() {
        println("Hello It's $name,\n\tHow's going on guys!")
    }

    fun baseClassData() {
        println("Value inside baseclass \"Name\" property: ${super.name}\n")
        println("Calling intro function from baseclass")
        super.intro()
    }
}

fun main() {

    println("\n----------------- Start of Baseclass -----------------\n")
    Base("sarvesh")
    println("\n----------------- End of Baseclass -----------------\n")

    println("\n----------------- Start of Subclass -----------------\n")
    Sub("sarvesh", "Patil")
    println("\n----------------- End of Subclass -----------------\n")


    println("-------------------------------------------------------")
    val webDev = WebDeveloper("janak", 25, 11, "NitroWeb")
    webDev.webDevIntro()
    println("-------------------------------------------------------")

    val androidDev = AndroidDeveloper("rinku", 28, 15, "Evecol")
    androidDev.androidDevIntro()
    println("-------------------------------------------------------")

    val iosDev = IOSDeveloper("manish", 24, 8, "NesTech")
    iosDev.iosDevIntro()
    println("-------------------------------------------------------")

    val winSoftWeb = WindowsSoftwareDeveloper("Anmol", 38, 45,"SoftInfo")
    winSoftWeb.windowsSoftwareDevIntro()
    println("-------------------------------------------------------")
    println()

    val movieInfo = Director("Interstellar", "Christopher Nolan")
    movieInfo.printInfo()
    println("-------------------------------------------------------")
    println()

    NewMember("Ritika", "Taniya", "Priya", "Tanya", "Khushi")

    println("-------------------------------------------------------")
    println()

    Details2().intro()
    println()
    Details2().baseClassData()
    println("-------------------------------------------------------")
    println()
}