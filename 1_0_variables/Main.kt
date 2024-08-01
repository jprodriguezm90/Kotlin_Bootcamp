//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {

    //TIP <b>Variables</b> <br>
    //<b>Type inference:</b> Kotlin can often infer the type of a variable based on the value you assign to it. <br>
    //<b>Null safety:</b> Kotlin has a null safety feature to prevent null pointer exceptions. <br>
    //<b>Immutability:</b> Variables declared with <b>'val'</b> are immutable, meaning their value cannot be changed after assignment. For mutable variables, use <b>'var'</b>.


    val myStringUnchangeable: String = "Hello, World!"
    //myStringChangeable = "Hello, Everyone!"  //error: val cannot be reassigned

    var myStringChangeable: String = "Hello, Kitty!"
    myStringChangeable = "Hello, Boss!"

}