import java.util.*
import kotlin.math.pow

//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {

    //TIP <b>Arrays</b> Arrays in Kotlin are fixed-size collections of elements of the same type. They are represented by the Array class.

    val numbers = intArrayOf(1, 2, 3, 4, 5)

    val namesMix = arrayOf("Alice", "Bob", "Charlie", 4 , 6 , 8)
    println(namesMix.contentToString())

    val myList = mutableListOf("tuna", "salmon", "shark") // this is a val reference to a List the reference could not be replace but you could manipulate the items of the List

    var fish = 12
    var plants = 5
    val swarm = listOf(fish,plants)
    val bigSwarm = arrayOf(swarm, arrayOf("dolphin" , "whale", "orka"))
    println(bigSwarm.contentDeepToString())

    //TIP Accessing elements

    val firstNumber = numbers[0] // Accessing the first element

    //TIP Iterating over arrays
    for (number in numbers) {
        println(number)
    }

    //TIP Array size
    val size = numbers.size

    //TIP Ranges
    val numbersRange = 1..5 // Closed range (includes 5)
    val charactersRange = 'a'..'z' // Range of characters

    //TIP Iterating over ranges
    for (number in numbersRange) {
        println(number)
    }

    //TIP Checking if a value is in a range
    val isInRange = 3 in numbersRange // true

    //TIP Common operations <br>
    //step: Specifies the step size for a range. <br>
    //downTo: Creates a descending range.
    val evenNumbers = 2..10 step 2
    val countdown = 10 downTo 1

    //TIP Combining arrays and ranges
    val numbersArray = IntArray(5) { it * 2 } // Create an array of even numbers using a range

    val array = Array(7){ 1000.0.pow(it) }
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

}