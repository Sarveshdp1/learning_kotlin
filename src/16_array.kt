fun main(args: Array<String>) {
    var array1 = arrayOf(1,2,3,4)
    for (i in array1) {
        print(" "+i)
    }

    println()
    var array2 = arrayOf<Int>(11,12,13,14,15)
    for (i in 0..array2.size-1) {
        print(" "+array2[i])
    }

    println()

    // array constructor
    var array3 = Array(10, {i -> 5*i}) // i is element and i*1 is the value of the elements ex. 1*1=1, 1*2=1 ..... 1*5=5 its and lambda
    for (i in array3.indices){
        print(" "+array3[i])
    }

    // creating multiplication table using lambda and array
    print("\nEnter a number: ")
    var input: Int = readLine()!!.toInt()
    var table = Array(11, {num -> num*input})
    for (i in 1..10) {
        println("$input x $i = ${table[i]}")
    }

    var gg = Array(10,{57}) // stores 57 in all 0..9 index
    for (i in gg) {
        println(i)
    }

    var intarray = floatArrayOf(1f,3f,4f,5f,5f) // byte short int long float double char boolean
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
    intarray.forEach({ index -> println("hi $index") }) // not iterate direclty print value


    // Multidimensional D arra
    var multid = arrayOf(
        arrayOf (1,2,3),
        arrayOf(11,22,33)
    )


    for (i in multid.indices) {
        for(j in multid[i].indices) {
            println(multid[i][j])
        }
    }

    for (i in multid[0].indices) {
        println(multid[0][i])
    }

    var a: Array<Int?> = arrayOfNulls(3)
    println(a.joinToString())
    a = arrayOf(1,2,3)
    println(a.joinToString())


    var b: Array<Array<Int>> = emptyArray()
    b = arrayOf(
        arrayOf(1,2,3),
        arrayOf(11,12,13),
        arrayOf(21,22,23),
    )
    println(b[2].joinToString())

    println(a.contentDeepEquals(b[0]))
}