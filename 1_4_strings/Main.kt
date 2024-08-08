import java.util.*

//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {

    //TIP <b>Strings</b> Kotlin provides a rich set of operations for manipulating strings. Let's delve into some of the most common ones: <br>

    val firstName = "John"
    val lastName = "Doe"

    //TIP Concatenation <br>

    val fullName = firstName + " " + lastName // Result: "John Doe"

    //TIP String templates <br>
    val age = 30
    val message = "Hello, my name is $firstName $lastName and I am $age years old."

    //TIP Accessing Characters <br>
    val greeting = "Hello"
    val firstChar = greeting[0] // Result: 'H'

    //TIP String Length <br>
    var text = "Kotlin is fun"
    val length = text.length // Result: 14

    //TIP Substrings <br>
    val sentence = "Learning Kotlin"
    val subString = sentence.substring(9) // Result: "Kotlin"

    //TIP Case Conversion <br>
    val word = "kotlin"
    val upperCaseWord = word.uppercase() // Result: "KOTLIN"
    val lowerCaseWord = word.lowercase() // Result: "kotlin"

    //TIP Replacement <br>
    text = "Hello world"
    val newText = text.replace("world", "Kotlin") // Result: "Hello Kotlin"

    //TIP Splitting Strings <br>
    val csvData = "apple,banana,orange"
    val fruits = csvData.split(",") // Result: ["apple", "banana", "orange"]

    //TIP Checking for Content <br>
    val email = "john.doe@example.com"
    val containsAt = email.contains("@") // Result: true
    val startsWithJohn = email.startsWith("john") // Result: true


    //TIP
    //<b>Other Useful Functions</b><br>

    //trim: Removes whitespace from both ends of a string. <br>
    //isEmpty: Checks if a string is empty.<br>
    //isNotEmpty: Checks if a string is not empty.<br>

    //<b>Additional Notes:</b><br>
    //Raw strings: Use triple quotes (```) for multiline strings without escaping special characters.<br>
    //Regular expressions: Kotlin supports regular expressions for more complex pattern matching.<br>
    //StringBuilder: For efficient string manipulation in loops, consider using StringBuilder.<br>

}