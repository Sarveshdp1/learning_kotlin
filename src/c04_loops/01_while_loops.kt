package c04_loops

/*
loops are used to repeatedly execute a block of code until the condition becomes false

- example of initialization, condition , progression
    initialization var i = 0
    condition inside (i<=10)
    progression i++ or i--

while loop checks the condition first then executes the body {}
this cycle continues until the condition becomes false
 */

fun main(args: Array<String>) {
    var num: Int = readLine()!!.toInt()

    // first increment then print
    while(num<=25) {
        num++
        println(num)
    }

    println("result of num: $num")

    var namesarray: Array<String> = arrayOf("Sarvesh","Sameer","Rahul","Rohit","Siddique")
    var index = 0

    // iterating using size of array as condition and printing element using index
    // index (variable value) increment after every iteration
    while (index < namesarray.size) {
        println("$index ${namesarray[index]}")
        index++
    }
}