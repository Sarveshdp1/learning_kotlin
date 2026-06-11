package c04_loops

import kotlin.text.iterator

fun main(args: Array<String>) {

    // normal iteration
    for (i in 1..10) {
        print("$i ")
    }

    // using step
    for (i in 1..11 step 2) {
        print("$i ")
    }

    /* without using downTo
    for (i in 10..1 ) {
        print(i)
    }*/

    // using downTo and step
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }

    // without using index direct store value
    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (num in numbers) {
        if (num%2==0) {
            println("$num is even")
        } else {
            println("$num is odd")
        }
    }
    var villege = arrayOf("kerhale","aherwadi","ainpure","waghoda")
    for (name in villege) {
        if (name == "kerhale") {
            println("$name have wifi")
        } else if (name == "ainpure") {
            println("$name dont have wifi")
        } else if (name == "aherwadi") {
            println("$name dont have wifi")
        } else {
            println("$name have wifi")
        }
    }

    // .indices only store index starting from 0 to n
    var names = arrayOf("Sarvesh","Sameer","Siddique","Danish")
    for (num in names.indices) {
        println("$num ${names[num]}")
    }
    /*
    for (i in 0..names.size-1) {
        println("Name of Student $i is ${names[i]}")
        println(i)
    } */

    // .withIndex stores both index and value
    var surname = arrayOf("patil","mahajan","choudhary","rathod")
    for ((index, value) in surname.withIndex()) {
        println("element of index $index is $value")
    }


    // string iteration using for loop
    val myName: String = "Sarvesh"
    print("\nUsing without index: ")
    for (letters in myName) {
        print("$letters ")
    }
    print("\nUsing indices: ")
    for (i in myName.indices) {
        print("${myName[i]} ")
    }
    println("\nUsing withIndex:")
    for((index,value) in myName.withIndex()) {
        print("Element of: $index is $value\n")
    }
}