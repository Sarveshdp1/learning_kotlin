package c06_collections// hashset is a mutable generic unordered collection which only stores unique element. it does not allow duplicate elements and provides constant-time performance only basic task like add, remove and contains
// constant-time performance means the execution time does not grow significantly as the collection size increases

fun main() {
    // created hashset
    val num = hashSetOf(1,2,3,4,5)
    val alpha = hashSetOf('a','b','c','d','e','f','d') // duplicate element removed
    println(num)
    println(alpha)
    println()

    // accessing element using indexing
    println("element at 0 is ${alpha.elementAt(0)}\n")

    // index of element
    println("index of e is ${alpha.indexOf('e')}")
    println("index of d is ${alpha.lastIndexOf('d')}\n")

    // element contain in collection
    println("is a available ? ${alpha.contains('a')}")
    println("is b and g available ? ${alpha.containsAll(hashSetOf('b','g'))}\n")

    // hashset is unordered so when new element is added it will not be in order
    // adding elements
    num.add(10)
    println(num)
    num.addAll(hashSetOf(20,30,40,50))
    println(num)
    println()

    // removing elements
    num.remove(50)
    println(num)
    num.removeAll(hashSetOf(20,10,30,40))
    println(num)
    println()

    // traversing
    // for loop
    for (i in num) print("$i ")
    println("\n")
    // forEach
    num.forEachIndexed { i , v -> println("element at $i is $v")}
    println()
    // iterator
    val iterator = num.iterator()
    while (iterator.hasNext()) print("${iterator.next()} ")
    println("\n")

    // empty set
    val setA = hashSetOf<String>()
    val setB = hashSetOf<Int>()
    println("set A is empty ? ${setA.isEmpty()}")
    println("set b is not empty ? ${setB.isNotEmpty()}")

}