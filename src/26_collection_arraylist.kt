// arraylist is used to create a dynamic array which allows to modify the size of array add/remove modify the elements etc

fun main() {
    // creates empty array of String
    val arrayList = ArrayList<String>()

    // add(index,element-value) this function is used to add new element. The index parameter is optional by default its appends to the end
    // adding elements values
    arrayList.add("Sarvesh")
    arrayList.add("Rohit")
    // accessing elements values
    for (i in arrayList) print(i+" ")
    println()
    // reassigning element value
    arrayList.add(1, "Rahul") // add/inserted Rahul on index 1 and the element on index 1 is shifted to index 2
    // accessing element values
    for (i in arrayList) print(i+" ")
    println()

    // current-list.addAll(index, specified-collection) this function is used to add all element of a specific collection to the current list () at the specified index the index is optional and by default its appends to the end
    val arrayList2 = arrayListOf<String>("Ganesh","Chetan","Sumit")
    // before . is the list we want to add the elements in and inside () is the list where we copy the element from
    arrayList2.addAll(arrayList)
    // accessing elements of arrayList2
    for( i in arrayList2) print(i+" ")
    println()

    // .get(index) and [index] is used to return/access the element of the list using index
    println("element on index 2 is ${arrayList2.get(2)}")
    println("element on index 3 is ${arrayList2[3]}")
    println("element on list is ${arrayList2.last()}")

    // .set(index, value) is used to replace the element-value of specified index element
    val intro = arrayListOf<String>("My ", "name ", "is ", "Sumit")
    for (i in intro) print("${i }")
    println()
    // replacing the element value using index
    intro.set(3, "Sarvesh")
    for (i in intro) print("${i }" )
    println()

    // .indexOf() is used to know the index of element and returns -1 if the element is not present in the list
    println(intro.indexOf("Sarvesh")) // 3
    println(intro.indexOf("Rahul")) // -1 because Rahul element is not present in intro list

    // .remove() removes element from current list if it available
    intro.remove("is ")
    for ( i in intro) print(i+" ")
    println()
    // .removeAt() removes element using index
    intro.removeAt(2)
    println(intro)

    // clear() removed all elements from the list
    intro.clear()
    println(intro)

    // .isEmpty() checks whether the list is empty or not returns boolean
    println(intro.isEmpty())

    // .size return the size of list 1...n
    println(arrayList.size)

    // .contain() return boolean based on element present or not
    println(arrayList.contains("Sarvesh"))

}