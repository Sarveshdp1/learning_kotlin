package c07_oops

import java.util.Scanner

// interfaces is collection of abstract methods (functions) or functions with default implementation and properties (variable) that define a common contract/blueprint for class implement the interface
// the classes implemented the interface must have those functions and properties, but interfaces itself does not define the abstract function and properties how they work, the class does
// an interface is similar to an abstract class, but it can be implemented by multiple classes, and it cannot have state. (state meaning stored data (property inside interfaces cannot store default value))

// interface is a custom type that cannot initialize directly by itself
// method declaration with default implementation
// property declaration, possibly with getters only with no backing field (no default value)
// default values for method parameters

// defining interface it is declared by the interface keyword and then the name
private interface Product{
    // declaring abstract function
    // no default implementation
    fun model(model:String) {}
    fun brand(brand:String) {}
}

private class Mobile : Product {

    // overriding implemented function in interface
    override fun model(model:String) {
        println("Model: $model")
    }
    override fun brand(brand:String) {
        println("Brand: $brand")
    }
}

// default implementation
// the functions declared inside interfaces can have default implementation in body and also default parameters (its in normal function not abstract function)
private interface Favorite {
    fun flower ( /*default argument */ name:String = "Rose", color:String = "Red"){
        // method declaration can have default implementation (optional) (It's not an abstract function)
        println("(Default implementation)")
        println("Favorite flower name is $name, and its color is $color")
    }

    fun printGreeting() {
        println("Hello (Its an default implementation)")
    }
}

private class Fav : Favorite {
    override fun flower (name:String, color:String) {
        println("(Overridden function of interface)")
        println("$name\n\tIts a great flower, and its $color")
    }
    override fun printGreeting() {
        // can call interface members with super keyword
        //super.flower(name, color)
        super.printGreeting()
        println("\tGood Morning (Its a overridden implementation)")
    }
}

// properties in the interfaces don't have state, can't be instantiated (no backing field) which means cannot store value inside interface
// With getter we can have default implementation
interface Salary {

    // abstract property
    val oldAmount: Int

    // property declaration can have default implementation (no backing field) (optional) (It's not an abstract property)
    val currentAmount: Int
        get() = 46000
}

private class Employee1(oldSalary: Int) : Salary {
    override val oldAmount = oldSalary

    init {
        println("Old Salary Amount: $oldAmount")
    }
}

// interface inheritance - like class inheritance interface can also inherit
// derived interface can define its own members
// interface and inherit multiple interfaces
interface Dimensions{
    val width: Double
    val breadth : Double
}
// inherited interface
interface CalculatedParameters : Dimensions {
    fun area(): Double
    fun perimeter(): Double
}
// class implemented inherited interface
private class Rectangle (override val width: Double, override val breadth :Double) : CalculatedParameters {
    override fun area():Double {
        return width * breadth
    }
    override fun perimeter() : Double {
        return (width + breadth) * 2
    }
}

// multiple interface implementation
// we can implement multiple interface in same class
// its implementation is followed by comma "," (interface1, interface2)
interface PersonalInfo {
    val name:String
    val age:Int
}

interface ProfessionInfo {
    val department:String
    val salary:Int
}

interface PrintInfo {
    fun printInformation(): String
}

private class PersonInformation (override val name:String, override val age:Int, override val department:String, override val salary:Int) : PersonalInfo, ProfessionInfo, PrintInfo {
    override fun printInformation(): String {
        return """
            Information of the Person
            
            Personal Information
                Name: $name
                Age: $age
                
            Professional Information
                Department: $department
                Salary: $salary
        """.trimIndent()
    }
}

fun main() {

    val smartPhone = Mobile()
    smartPhone.model("F1")
    smartPhone.brand("POCO by Xiaomi")
    println()

    // here we are calling the overridden fun, but without arguments
    // the argument its accessing from the original function defined in interface which has default values
    Fav().flower()
    println()

    // here we are calling the overridden fun and also passing arguments manually
    Fav().flower("SubFLower", "Yellow")
    println()

    // calling overridden function which is in itself calling interface member
    Fav().printGreeting()
    println()

    // obj of Employee Class and passing argument to constructor
    val emp = Employee1(25000)
    // accessing interface member via Employee Class obj
    println("Current Salary Amount: ${emp.currentAmount}")
    println()

    print("Enter Width of Rectangle: ")
    val width = readln().toDouble()
    print("Enter Breadth of Rectangle: ")
    val breadth = readln().toDouble()

    val obj = Rectangle(width, breadth)
    println("Area of Rectangle: ${obj.area()}")
    println("Perimeter of Rectangle: ${obj.perimeter()}")

    val scan = Scanner(System.`in`)

    print("Enter Name: ")
    val name = scan.nextLine()
    print("Enter Age: ")
    val age = scan.nextInt()
    scan.nextLine()
    print("Enter Department: ")
    val dept = scan.nextLine()
    print("Enter Salary: ")
    val salary = scan.nextInt()

    val personInfo = PersonInformation(name,age,dept,salary)
    val output:String = personInfo.printInformation()
    println(output)

}
