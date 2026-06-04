// map is unorder collection that stores data in key-value pairs, it uses linkedHashMap which uses linkedList like set to manage the order
// each key needs to be unique
// each key can only store one value
// if the key is repeated only the last value is retained

// map has 2 type 1.mutable 2.immutable

// in mutable map the getting operator can also use for setting or adding

fun main() {
    val map = mapOf(146 to "Sarvesh", 154 to "Sanket", 147 to "Sarthak", 154 to "Siddique") // 154 key is repeated so last value is stored

    // accessing key, value and entries
    println("map entries: $map")
    println("map keys: ${map.keys}")
    println("map values: ${map.values}")

    // map size
    println("size of map is: ${map.size}")
    println("size of map is: ${map.count()}")

    // empty map
    val emptymap = mapOf<Int,String>()
    println("is mao empty: ${emptymap.isEmpty()}")

    // accessing value using key
    println("value of key 147: ${map[147]}")
    println("value of key 154: ${map.getValue(154)}")
    println("value of key 148: ${map.getOrDefault(148, "Saptavi")}") // if key is not present in map then "Saptavi" will return
    println("value of key 149: ${map.getOrElse(3, {"key not found"})}") // if key is not present when key not found will return

    // map contains key or value
    println("key 146 available ? : ${map.contains(146)}")
    println("key 156 available ? : ${map.containsKey(156)}")
    println("value Sarthak available ? : ${map.containsValue("Sarthak")}")

    // created map of string
    val studAge = mapOf("Sarvesh" to 20, "Rohit" to 26, "Nimesh" to 35)

    // accessing key and value using loop
    map.forEach{key, value -> println("Roll no of $value is $key")}

    for (i in studAge.keys) {
        println("$i age is ${studAge[i]}")
    }

    // created mutable map
    val mutableMap = mutableMapOf(1 to "MH", 2 to "UP", 3 to "MP")
    println(mutableMap)

    // changed value
    mutableMap[2] = "JK"
    mutableMap.set(3, "UK")
    println(mutableMap)

    // remove key-value
    mutableMap.remove(3) // removed key-value element using key
    mutableMap.remove(2,"JK") // only removes when the key-value is matched
    println(mutableMap)

    // add key-value
    mutableMap[2] = "RJ" // add single pair
    mutableMap.put(3, "GJ") // add single pair
    mutableMap.set(4, "UP") // add single pair
    mutableMap += (5 to "MP") // add single pair
    mutableMap.putAll(mapOf(5 to "JK",6 to "GA")) // add multiple pairs
    mutableMap.putIfAbsent(5, "UK") // add only if not present
    println(mutableMap)

    // remove all elements
    mutableMap.clear()
    println(mutableMap)
}