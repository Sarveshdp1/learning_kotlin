// hashmap is unordered mutable collection which stores data in key-value pair and the key needs to be unique but the value can be duplicate and the key only can store one value
// hash table implemented hashmap does not guarantee of order of key-value neither the order on insertion

fun main() {

    // there are four public constructor for hashmap

    // 1. HashMap<T,T>()
    // creates an empty hashmap
    val hashmap1 = HashMap<String,Int>()

    // 2. HashMap<T,T>(initialCapacity)
    // creates an empty hashmap with initial capacity the default capacity is 16
    // initial capacity means the internal buckets length/size same like index
    val hashmap2 = HashMap<String,Int>(10)

    // 3. HashMap<T,T>(initialCapacity,loadFactor)
    // creates an empty hashmap with initialCapacity and loadFactor the default loadFactor is 0.75f
    // load factor is only defined in float value and its multiplied by the initial capacity like (10*0.5=5)
    // so when the element inside collection reaches 5 the map doubles the initial capacity so it don't affect on performance
    // the capacity double multiple time like now its 20 now the threshold is 20*0.5=10 not when the element reach 10 it doubles again 20*2=40 and go on
    // if initialCapacity and loadFactor are not being used both will get ignored
    val hashmap3 = HashMap<String,Int>(10,0.5f)

    // 4. HashMap(mapOf)
    // uses mapOf or mutableMapOf to create HashMap with mapOf or mutableMapOf elements
    val normalMap = mapOf(1 to "Sarvesh", 2 to "Rohit")
    val hashMap4 = HashMap(normalMap)

    // manipulating maps

    // creating HashMap and explicitly declaring datatype
    val employeesSalary : HashMap<String, Int> = HashMap()

    // adding elements
    employeesSalary["Yogesh"] = 25000
    employeesSalary["Ganesh"] = 45000
    employeesSalary["Rahul"] = 15000
    employeesSalary.put("Rohini", 50000)
    employeesSalary.putAll(mapOf("Shivani" to 2000, "Yogini" to 34000))

    // accessing value using key
    println("Salary of Rohini is ${employeesSalary["Rohini"]}")
    println("Salary of Yogini is ${employeesSalary.get("Yogini")}\n")

    // traversing
    employeesSalary.forEach{key, value -> print("Name $key Salary $value \n")}
    println()

    // removing elements
    employeesSalary.remove("Yogini")
    employeesSalary.remove("Ganesh", 45000)

    // traversing updated map
    for(i in employeesSalary.keys) println("Name $i Salary ${employeesSalary[i]}")
    println()

    // element contain
    if (employeesSalary.containsKey("Rahul")) println("Rahul is an Employee"); else println("Rahul is not an employee");
    println()
    employeesSalary.forEach { key, value -> if (value<30000) println("$key has less salary"); else if (value>40000) println("$key has good salary") }
    println()

    // replace value
    employeesSalary.replace("Yogesh", 35000)
    println(employeesSalary)
    println()

    // replacing all values
    employeesSalary.replaceAll { key, value -> 60000 }
    println(employeesSalary); println()

    // clear all elements
    employeesSalary.clear()
    println(employeesSalary)
    println("Employee Salary Map is Empty ? ${employeesSalary.isEmpty()}")


    // advice for when to use normal collection and hash collection
    // use set and map use when order is needed but performance is not needed for bulk element to add or remove
    // use hashset and hashmap when order is not needed but need instant performance for add or remove element
}