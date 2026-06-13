package c07_oops

// getter and setter are the functions used to interact with the property (variable) either var or val
// when we create a property it automatically generates a getter and a setter and we can modify it

// get() : getter - retrieves (access) the value of property
// set() : setter - assign or update/reassign the value of property

// property uses the backing field to store the value
// backing field is a hidden storage which uses memory to store the value for property

// there are two types of property in kotlin
// 1. var - mutable values can be changed after creation work with both getter and setter
// 2. val - immutable (read-only) value cannot change after creation only getter works

fun main() {
    var name = ""
    name = "Sarvesh"
    val age = 20

    name = "Tony"
    // age = 35 - compilation error ('val' cannot be reassigned)

    println(name + age)
    println()

    class Student {
        var myName = "DefaultValue"
            get() = field // when we access the property, in return we get the field because get() = field. The field stores the value (backing field) as explained at starting comment
            set(value) { // (value) mean the value we put in the parathesis x.get("John"). The name value we chose, we can use any name it's just a parameter contains the value
                field = value // when we reassign value using .set(), the field = value reassign the value of field (backing field)
            }

        var lastName = "Patil"
            get() = field
        // the setter not declared here but its has been automatically generated


        // custom getter setter
        // using conditions
        var age = 0
            set(age) {
                if (age >= 18) {
                    field = age
                } else {
                    println("you are under age")
                }
            }

        // private setter
        var school = ""
            private set
        // private is a modifier which not allows to modify the property from outside the class
        // it can modify using a member function

        fun schoolChanged(schoolName: String) {
            school = schoolName
        }
    }

    val studentInfo = Student()
    studentInfo.myName = "Pranay"
    print("Hello ${studentInfo.myName} ")

    studentInfo.lastName = "Rajput"
    println(studentInfo.lastName)

    studentInfo.age = 15 // setter not return any value but as the 15 < 18 and the else condition contains println so it will run that statement and not update the field
    println(studentInfo.age)

    // studentInfo.school = "Modern" cannot access compilation error
    studentInfo.schoolChanged("Modern English School")
    println("Study's in ${studentInfo.school}")

}