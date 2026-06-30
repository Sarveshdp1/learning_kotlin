package c07_oops

sealed class Program()

class Loading : Program()

class Finished : Program()

class Error : Program()

fun main() {

    val a: Program = Error()

    val result = when(a) {
        is Loading -> println("Loading...")
        is Finished -> println("Finished...")
        is Error -> println("Error...")
    }
}