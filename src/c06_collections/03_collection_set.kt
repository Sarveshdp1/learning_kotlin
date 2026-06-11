package c06_collections// set is generic unordered element collection that allows storing multiple datatype of elements but does not allow storing duplicate elements
// set are unordered means no index based access [] or get()
// sets are internally maintains insertion order. Kotlin sets internally uses linkedHasSet which uses linked list to remember the insertion order

// 2 types of set
// 1. immutable set created using setOf() it's read-only which don't allow element modification
// 2. mutable set created using mutableSetOf() it's R/W which allows element modification add/remove not allows to replace contains of elements because no index accessing [] or set()

fun main() {

    // immutable set

    val immutableSet = setOf("Sarvesh","Siddharth",26,74,26,44) // ignored/removed the 2nd 26 element because set don't allow storing duplicate elements
    println(immutableSet)

    // accessing elements
    // [] and .get() wont work with sets
    println("element at index 2 : ${immutableSet.elementAt(2)}")
    println("element at last index : ${immutableSet.elementAt(immutableSet.size-1)}")
    println("first element : ${immutableSet.first()}") // first element
    println("last index ${immutableSet.last()}") // last element
    println()

    // indexing
    println("index of Siddharth : ${immutableSet.indexOf("Siddharth")}")
    println("index of 26 : ${immutableSet.lastIndexOf(26)}") // only lastIndexOf() works and .lastIndex don't use .size-1 to know last index
    println()

    // basic functions of set
    val numbers = setOf(1,2,3,4,5)
    val num = setOf(1,2,3,4,5)
    println("total num of elements : ${numbers.count()}")
    println("lowest value number : ${numbers.min()}")
    println("highest value number : ${numbers.max()}")
    println("Kt01_Fundamentals.sum of all elements : ${numbers.sum()}")
    println("avg of all elements : ${numbers.average()}")
    println("set has num 4 : ${numbers.contains(4)}")
    println("set has num 3 and 9 : ${numbers.containsAll(setOf(3,9))}")
    println("Is numbers set is empty : ${numbers.isEmpty()}")
    println("is numbers and num set contains same elements : ${numbers == num}")
    println()

    // mutable set
    println("\nMutable Set")
    val mutableSet = mutableSetOf(1,2,3,4,5,"Sarvesh","Patil")
    for (i in mutableSet) print("$i ")
    println()

    // adding elements
    mutableSet.add(20) // cannot insert using index only can be added after last element
    println(mutableSet)
    mutableSet.addAll(setOf(50,40,30)) // add multiple elements
    println(mutableSet)
    println()

    // removing elements
    mutableSet.remove(20)
    println(mutableSet)
    mutableSet.removeAll(setOf(30,50))
    println(mutableSet)
    println()

    // iterator creates iterator and work based on cursor detailed explanation available in 02_collection_list.kt
    val iterator = mutableSet.iterator()
    while (iterator.hasNext()) print("${iterator.next()} ")
    println()

    // remove all elements
    mutableSet.clear()
    println(mutableSet); println("mutableSet is empty ? ${mutableSet.isEmpty()}")
}