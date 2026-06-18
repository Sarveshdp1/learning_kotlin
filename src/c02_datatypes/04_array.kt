package c02_datatypes

// arrays are collection of element and each element can store same type of data
// array size are immutable but element values are mutable
// types of array
// 1. object array (generic / boxed array) created using Array<T>() , arrayOf()
// 2. primitive array, types are - byte/short/int/long/float/double/char/boolean created using intArrayOf(), byteArrayOf() it's not object it' s factory function which creates IntArray

fun main(args: Array<String>) {
    val array1 = arrayOf(1,2,3,4)
    for (i in array1) {
        print(" "+i)
    }

    println()
    val array2 = arrayOf<Int>(11,12,13,14,15)
    for (i in 0..array2.size-1) {
        print(" "+array2[i])
    }

    println()

    // array constructor
    val array3 = Array(10, {i -> 5*i}) // "i" is index and 5*i is the value of the elements of index. 5*0=0.....5*9=45 the lambda store returns value and array store it in elements one by one like loop
    for (i in array3.indices){
        print(" "+array3[i])
    }

    // creating multiplication table using lambda and array
    print("\nEnter a number: ")
    val input: Int = readLine()!!.toInt()
    val table = Array(11, {num -> num*input})
    for (i in 1..10) {
        println("$input x $i = ${table[i]}")
    }

    val gg = Array(10,{57}) // stores 57 in all 0..9 index
    for (i in gg) {
        println(i)
    }

    // primitive type array
    val intarray = floatArrayOf(1f,3f,4f,5f,5f) // byte short int long float double char boolean
    for (i in intarray) {
        print(" "+i)
    }

    println()

    // both are member functions
    // get() to access the element using index
    println("using get() element on 2: "+intarray.get(2))
    // set() to edit the array element reassign value
    intarray.set(2,50.3f)
    println("using set() element on 2: "+intarray.get(2))

    // index operator [] is an overloaded operator and actually calls the .get() member function
    println("using [] element on 3: "+intarray[3])
    // reassign value using []
    intarray[3] = 80.0f
    println("reassign element on 3: "+intarray[3])

    // for each loop
    intarray.forEach({ index -> println("hi $index") }) // forEach passes index element value to lambda {}


    // Multidimensional D arra
    val multid = arrayOf(
        arrayOf (1,2,3),
        arrayOf(11,22,33)
    )


    // accessing multi d array using nested loop
    for (i in multid.indices) {
        for(j in multid[i].indices) {
            println(multid[i][j])
        }
    }

    // accessing multi d array using loop
    for (i in multid[0].indices) {
        println(multid[0][i])
    }

    // array of 3 null element
    var a: Array<Int?> = arrayOfNulls(3)
    println(a.joinToString()) // accessing array element in string
    // define value to null elements
    a = arrayOf(1,2,3)
    println(a.joinToString()) // accessing array element in string

    // empty array
    var b: Array<Array<Int>> = emptyArray()
    // define multi d array elements to empty array
    b = arrayOf(
        arrayOf(1,2,3),
        arrayOf(11,12,13),
        arrayOf(21,22,23),
    )
    println(b[2].joinToString())


    // comparing 2 array elements (==)
    // .contentEquals() for single d array
    // .contentDeepEquals() for multi d array
    println(a.contentDeepEquals(b[0]))
}