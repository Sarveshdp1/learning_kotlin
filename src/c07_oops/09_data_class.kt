package c07_oops
/*
 data class - the class which were created just to store/hold data in it. Those are called data classes
 it is mark with data keyword

 kotlin automatically creates some useful functions for those classes, so you don't have to write it by yourself
 1. equals() - to check if two object are equal
 2. hashcode() - used when storing object in hash-based collections
 3. toString() - to get a string version of the object
 4. copy() - to copy an object with some modified values

 example:
 data class Employee(val Name: String, val Age: Int)

 when we create a data class kotlin automatically gives the above listed functions to it using the primary constructor parameters

 data class have some rules
 1. primary constructor must at least contain one parameter
 2. all constructor parameter must be defined with val or var
 3. data class cannot be abstract, open, sealed or inner
 4. data class can only implement interfaces, not extend other class
 */

// defined data class for .toString()
private data class Group(val mem1:String,val mem2:String,val mem3:String,val mem4:String)

// defined data class for .copy()
private data class StudentDetails(val name: String, val age: Int) {
    var lastName:String = ""
}

// defined data class for .equals()
private data class Menu(val item1:String, val item2:String)
private data class Menu2(val item1:String, val item2:String)

fun main() {

    // using toString() - return a string showing all the values in the primary constructor
    println("Using .toString()")
    val members = Group("Rahul", "Sunil", "Mayank", "Kunal")
    println(members) // kotlin automatically use to string
    // or
    val result = members.toString()
    println(result)

    // to string can only access the constructor parameters value not the member properties (inside class body)

    // example
    data class Name(val name:String) {
        val lastChar: Char = name.last()
    }

    val x = Name("Sarvesh")
    println(x)
    println(x.lastChar.toString()) // we have to explicitly provide the value to the toString()
    println()

    // using copy() - sometimes we want to make a copy of the object with change of some arguments (value) here the copy() is used for
    // it copies all arguments or members defined in primary constructor (not the property declared in class body)
    // two objects can have same primary parameter values and different class body properties values if defined
    println("Using .Copy()")

    val stud = StudentDetails("Kartik", 25)
    stud.lastName = "Patel"
    println("$stud Last Name: ${stud.lastName}")

    val stud2 = stud.copy(name="Manish") // use name arguments to redefine the correct property
    stud2.lastName = "Negvi"
    println("$stud2 Last Name: ${stud2.lastName}")

    // same primary constructor parameter arguments value as stud2 obj and different body property value
    val stud3 = stud2.copy()
    stud3.lastName = "Goyal"
    println("$stud3 Last Name: ${stud3.lastName}")

    println()

    // using .equals()
    // it returns true boolean value of two objects have same contents (same numbers of parameter and values)
    // it works similar to "==", but works differently with Float and Double values
    println("Using .equals()")

    // First Class
    val list1 = Menu("Charger", "Earbuds")
    val list2 = Menu("Charger", "Earbuds")
    val list3 = Menu("TV", "Mobile")

    // Second Class
    val listx = Menu2("Charger", "Earbuds")

    println(list1.equals(list2))
    println(list1.equals(list3))
    println(list1==list2)

    // return "false" because contents are same but classes are different
    println(list1.equals(listx))

    println()

    // using .hashCode() - returns hashCode values for the object
    println("Using .hashCode()")

    println(list1.hashCode())
    println(list2.hashCode())
    println(list3.hashCode())

    println()

    // this is where data classes are useful
    // 1. custom type for collection or array
    // maintains type safety as every data is stored in a different parameter which has different type in it
    // basically it store the provided data in object in the structure of the class
    println("Use case of data class in Real-World!")

    data class StaffDetails(val name:String, val age:Int, val department:String, val address:String)

    // no need to use explicit type declaration <StaffDetails> as Kotlin infer the type automatically
    val staff = arrayOf(
        StaffDetails("Monica Kumar", 23, "BCA", "Dadar, Mumbai, Maharashtra, India."),
        StaffDetails("Sumit Lokhande", 32, "MCA", "Thane, Mumbai, Maharashtra, India.")
    )

    println("Full Details Of Staff 1: ${staff[0]}")
    println("Name of Staff 2: ${staff[1].name}")
    println("Address of Staff 1: ${staff[0].address}")
    println("Age of Staff 2: ${staff[1].age}")
}