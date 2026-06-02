// list is a generic ordered collection of elements which allows us to store multiple data type value in single variable

// list has 2 types
// 1. immutable created using listOf() read-only
// 2. mutable created using mutableListOf() allows to add/remove/update elements and size

fun main() {

    // created immutable list which contains int value
    val immutableList = listOf(1,2,3,4,2,"Sarvesh")

    // accessing elements of list
    println("element on index 1 : ${immutableList[1]}") // element of index 1
    println("element on index 0 : ${immutableList.get(0)}") // element of index 0
    println("element on last index : ${immutableList[immutableList.size -1]}") // element of last index
    println("first element : ${immutableList.first()}") // first element
    println("last element : ${immutableList.last()}") // last element
    println("all elements : $immutableList") // all elements
    println()

    // index of element
    println("index of 3 : ${immutableList.indexOf(3)}") // index of specific element
    println("index of last 2:  ${immutableList.lastIndexOf(2)}") // if list has same element this function provide the index of the last element
    println("last index : ${immutableList.lastIndex}") // last index of list
    println()

    // iterate over the list
    for (i  in immutableList) print("$i ") // normal iteration
    println()
    for (i in 0 until immutableList.size) print("$i ") // iteration using range
    println()
    immutableList.forEachIndexed { index , element -> println("element on index $index is $element") } // iteration using forEachIndexed lambda function

    // listIterator
    // creates listIterator *[1,2,3,4,2,"Sarvesh"] in that all elements are listed and a cursor is pointer before the first element * is the cursor
    val listIterator = immutableList.listIterator()

    // .hasNext which weather is there a next element in the ( true we have 1 )
    while (listIterator.hasNext()) {
        // .next() prints the next element available in list which is 1
        print("${listIterator.next()} ")
    }
    // when while checks the condition again the cursor is moved to next [*1,2,3,4,2,"Sarvesh"] and go on
    // now the cursor is at the end [1,2,3,4,2,*"Sarvesh"] there is no element ahead so false
    println()

    // now we need to move the cursor to the beginning *[1,2,3,4,2,"Sarvesh"]
    while (listIterator.hasPrevious()) listIterator.previous()
    while(listIterator.hasNext()) {
        print("${listIterator.next()} ")
    }
    // now the cursor is at the end again
    println()

    // listIterator previous
    val immutableList2 = listOf(1,2,3,4,5,6)
    val listIterator2 = immutableList2.listIterator()

    // because the cursor is at the beginning now *[1,2,3,4,5,6] we have to move it to end because to use .hasPrevious the cursor need to be at the end
    while (listIterator2.hasNext()) listIterator2.next() // cursor is now at end [1,2,3,4,5,*6]
    // same as .hasNext() but works in reverse [1,2,3,4,2,"Sarvesh"]* to [1,2,3,4,2,"Sarvesh"*] to [1,2,3,4,2*,"Sarvesh"] ... [1*,2,3,4,2,"Sarvesh"]
    while (listIterator2.hasPrevious()) {
        print(listIterator2.previous())
    }
    println()

    // sorting list element in ascending or descending order (increment or decrement order)
    val unsortedList = listOf(5,3,8,1,9,2,4)
    println(unsortedList.sorted())
    println(unsortedList.sortedDescending())

    // checking elements
    println(unsortedList.contains(5)) // checks weather list has the element or not
    println(unsortedList.containsAll(listOf(5,2))) // checks weather list has those 2 elements or not


    // mutable list
    val mutableList = mutableListOf("Sarvesh","Sumit", "Rahul", "Suresh")
    println(mutableList)

    // modifying mutable list

    // adding element
    mutableList.add("Ramesh") // created new element
    mutableList.add(2, "Parth") // inserted new element between index 1 and 3 and shifted the existing element after index 3
    println(mutableList)

    // removing element
    mutableList.remove("Ramesh") // removed element using element
    mutableList.removeAt(3) // removed element using index
    println(mutableList)

    // updating element
    mutableList[1] = "Rohit"
    mutableList.set(2, "Siddharth")
    println(mutableList)

    // remove all elements
    mutableList.clear()
    println(mutableList)

}