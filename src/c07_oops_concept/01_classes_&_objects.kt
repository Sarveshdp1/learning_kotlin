package c07_oops_concept// class is a blueprint to create object
// classes stores properties(variable,etc) and functions
// object are created using classes to access the classes properties and functions
// multiple objects can be created if same class with different values/arguments(parameters) like create a single variable but use it with different multiples values without creating multiple variable or changing values

// simple class creation
class PersonalDetails{

    // member variable
    var firstName:String = ""
    var lastName: String = ""
    var age: Int = 0
    var gender: Char = 'M'

    // member function
    fun showDetails() {
        println("FirstName: $firstName\nLastName: $lastName\nAge: $age\nGender: $gender")
    }

}

// class with parameters
class Vehicle(val brand:String, val model:String, val purchaseYear:Int) {

    // member function
    fun details():String {
        return """
            Brand Name: $brand
            Model: $model
            Purchase Year: $purchaseYear
        """.trimIndent()
    }

}

fun main() {

    // creating object of class
    val personalDetails = PersonalDetails()

    // reassigning values of member variable using object
    personalDetails.firstName = "Sarvesh"
    personalDetails.lastName = "Patil"
    personalDetails.age = 20
    personalDetails.gender = 'M'

    // calling member function using object
    personalDetails.showDetails()
    println()


    // multiple object creation

    // 1st object of class and passing arguments of parameters
    val myBike = Vehicle(purchaseYear = 2006, brand = "Bajaj", model = "Discover")
    // calling member function using object
    val result:String = myBike.details()
    println(result)

    // 2nd object of same class and using named arguments
    val myCar = Vehicle("Suzuki", "Wagon-R", 2018)
    // calling member function using objects
    println(myCar.details())
    println()

}