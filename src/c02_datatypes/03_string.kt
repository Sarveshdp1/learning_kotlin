package c02_datatypes

// string - sequence/collection of characters

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
    val s1 = "Sarvesh"
    val s2 = "Sarveshsghsg"
    println("${s1.compareTo(s2)}")

    // types of string literals
    // 1. Escaped String = "hello" also called as single line string contain escape /n /t etc
    // 2. Raw String = """Hello""" also called as multi line string not contain escape


    // escaped string (single line string)
    val escapeString: String = "Hello"
    println(escapeString)

    // raw string (multi line string)
    val rawString: String = """
        |hello
        |my name
        |is 
        |sarvesh
    """.trimMargin()
    println(rawString)

    val rawString2: String = """
        my name is
        sarvesh
        hello how are
        you guys
    """.trimIndent()
    println(rawString2)


    // escape characters , \" \r \n \' \\ \t \b

    val str1 = "Hello"
    val str2 = "sarvesh"
    val str3 = "Sarvesh"

    println(str2==str3) // == just check the values
    println(str1===str2) // === check the value and memory StringPool

    for ((i,v) in myName.withIndex()) {
        print("$i and $v\n")
    }

    // multi-dollar interpolation allowed to use multiple dollar sign to trigger the interpolation (string template)
    // allows to use $ sign in string without any error
    val string2: String = $$"""
        money $$$ $$ $${4+3}
    """.trimIndent()


    // string formating
    // useful to control the floating numbers (.000000 to .000 or .00/.0 anything)
    println(string2)
    val num = 40.09889094889749
    val name:String = "Sarvesh"
    val name1 = String.format("%s %S", name, name)
    println(name1)

    val formate2 = String.format("%f %.2f", num, num)
    println(formate2)

    val num1 = -484
    val format3 = String.format("%(d mhanje %1\$d",num1)
    println(format3)

    println("%(d %2\$d".format(-50, 399646466L))

    // created formated string variable
    val new = "%s age is %d".format(myName, 20)
    println(new)

    // string functions
    // allows to replace specific elements of string
    myName = myName.replace("Sarv", "Gan") // Ganesh
    println(myName.contains("sh")) // true Ganesh has sh
    println(myName.startsWith("Gan")) // true Ganesh has Pur
    println(myName.endsWith("sh")) // true Ganesh ends with sh

    // splits name with character available in string but default is , inside [] squire braces
    val myNewName: String = "Sarvesh"
    println(myNewName.split("")) //[,S,a,r,v,e,s,h]

    // trim, remove unwanted spaces from starting and ending of string
    val greeting = "              Hello Everyone     How are you                         "
    println(greeting)
    println(greeting.trim())

}