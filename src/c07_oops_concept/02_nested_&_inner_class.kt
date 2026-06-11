package c07_oops_concept// class inside class are called nested or inner class with their different features

// nested class is a class created inside another class without inner keyword by default nested class don't have access of outer class members

// accessing nexted class property using object of nested class
class GovernmentCollegeStudent(val myName:String, val myRollNo:Int) {
    class BcaStudent(val studName: String, val studRollNo:Int) {
        fun studentDetails():String {
            return "Name and RollNo of Student\n\tName: $studName\n\tRollNo: $studRollNo"
        }
    }
    fun studDetails() {
        val details = BcaStudent(myName, myRollNo)
        println(details.studentDetails())
    }
}

// nested class creation
class PrivateCollegeStudent {
    class BcaStudent(val studName: String, val studRollNo:Int) {
        fun studentDetails() {
            println("Name and RollNo of Student\n\tName: $studName\n\tRollNo: $studRollNo")
        }
    }
}

// inner class is a nested class with inner keywords unlike nested class the inner class can access the members of outer class
class Google{

    val about = "kt07_object_oriented_programming.Google created search engine"

    inner class InnerClass{
        fun aboutGoogle(){
            println(about)
        }
    }
}

fun main() {

    print("Enter your name: ")
    val name = readln()
    print("Enter your Roll No.: ")
    val rollNo = readln().toInt()

    // accessing nested class property with outer class object
    val govClgBcaStudent = GovernmentCollegeStudent(name, rollNo)
    govClgBcaStudent.studDetails()

    println()

    // accessing nested class property without creating object of nested class inside outer class
    val pvtClgBcaStudent = PrivateCollegeStudent.BcaStudent(name,rollNo)
    pvtClgBcaStudent.studentDetails()
    println()

    // creating object of outer class
    val googleCompany = Google()
    // accessing inner class using outer class object
    googleCompany.InnerClass().aboutGoogle()

}