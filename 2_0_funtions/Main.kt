import java.util.*
import java.util.Calendar

//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {

    //TIP <b>Function</b>  are reusable blocks of code that perform specific tasks. They are essential for structuring and
    // organizing your code, improving readability, and promoting code reusability.
    printHello()
    dayOfWeek()
}

//TIP Function Structure
/*
fun functionName(parameter1: Type1, parameter2: Type2): ReturnType {
    // Function body
    return returnValue
}
*/

fun printHello(){
    println("Hello World!")
}

fun dayOfWeek(){
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val dayName = dayOfWeek(dayOfWeek)
    println("What day is today? $dayName")

}

fun dayOfWeek(value: Int) : String {
    return when (value){
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        1 -> "Sunday"
        else -> {"Invalid day number"}
    }
}