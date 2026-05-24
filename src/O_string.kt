fun main(args: Array<String>) {

    // empty string declaration
    var hello: String = String()

    // string element access
    hello = "hey"
    println(hello)
    println(hello[1])
    println(hello.get(2))

    // string element iteration
    var myName:String = "Sarvesh"
    for (i in 0..myName.length-1) {
        print(myName[i])
    }

    // string template
    println("\nmy name is $myName and my name letter length is ${myName.length}")

    // string functions
    println("length of the string - ${myName.length}")
    println("element on 3 index - ${myName[3]}")
    println("element on 5 index using get() - ${myName.get(5)}")
    println("elements from index 3 to 6 - ${myName.subSequence(3, 6)}") // element on end is not included excluded use +1 (3, 7)

    // String compareTo
    var s1 = "Sarvesh"
    var s2 = "Sarveshsghsg"
    println("${s1.compareTo(s2)}")

    // types of string literals
    // 1. Escaped String = "hello" also called as single line string contain escape /n /t etc
    // 2. Raw String = """Hello""" also called as multi line string not contain escape

    var escapeString: String = "Hello"

    var rawString: String = """
        |hello
        |my name
        |is 
        |sarvesh
    """.trimMargin()

    var rawString2: String = """
        my name is
        sarvesh
        hello how are
        you guys
    """.trimIndent()

    println(rawString2)


    // escape characters , \" \r \n \' \\ \t \b

    var str1 = "Hello"
    var str2 = "sarvesh"
    var str3 = "Sarvesh"

    println(str2==str3) // == just check the values
    println(str1===str2) // === check the value and memory StringPool

    for ((i,v) in myName.withIndex()) {
        print("$i and $v\n")
    }

    var string2: String = $$"""
        money $$$ $$ $${4+3}
    """.trimIndent()

    println(string2)
    var num = 40.09889094889749
    var age:String = "Sarvesh"
    var name1 = String.format("%s %S", age, age)
    println(name1)
    var formate2 = String.format("%f %.2f", num, num)
    println(formate2)
    var num1 = -484
    var format3 = String.format("%(d mhanje %1\$d",num1)
    println(format3)


    println("%(d %2\$d".format(-50, 399646466L))

    myName = myName.replace("Sar", "Pgg")

    println(myName)

    var new = String.format("%s age is %d",myName, 555)

    println(new)


    println(myName.contains("sh"))

    println(myName.startsWith("Pgg"))

    println(myName.endsWith("sh"))

    var myNewName: String = "Sarvesh"

    println(myNewName.split(""))

}