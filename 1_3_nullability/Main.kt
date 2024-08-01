//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {

    //TIP <b>Nullability</b> Kotlin helps avoid null pointer exceptions <br>

    //val myNull: String = null // error: null can not be a value of a non-null Type String <br>

    //TIP You can use '?' indicator as a null 
    var myNull: String? = null

    var myListItemsNullable: List<String?> = listOf(null,null)
    var myListNullable: List<String>? = null
    var myListNullableWithItemsNullable: List<String?>? = null
    myListNullableWithItemsNullable = listOf(null,null)

    //TIP you can force back the null with '!!' operator
    myNull = "1"
    myNull!!.toInt()

    //TIP you can check if is null return something else with '?:' Elvis operator

    var myNumber = myNull.toInt().dec() ?: 0 // myNumber = 0



}