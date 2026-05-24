fun main(args: Array<String>) {
    var num: Int = readLine()!!.toInt()

    while(num<=25) {
        num++
        println(num)
    }

    println("result of num: $num")

    var namesarray: Array<String> = arrayOf("Sarvesh","Sameer","Rahul","Rohit","Siddique")
    var index = 0

    while (index < namesarray.size) {
        println("$index ${namesarray[index]}")
        index++
    }
}