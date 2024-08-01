//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {

    //TIP <b>Data Types</b>
    val myByte: Byte = 127
    val myShort: Short = 32767
    val myInt: Int = 2147483647
    val myLong: Long = 9223372036854775807L
    val myFloat: Float = 3.14f
    val myDouble: Double = 3.14159265358979

    val myBoolean: Boolean = true
    val myChar: Char = 'A'
    val myString: String = "Hello, World!"

    //TIP You can use any type of number in the class Number
    val myNumber: Number = 9223372036854775807L


    //TIP You can use 'int' as an object
    1.toLong()


    //TIP You can use '_' in syntax of Numbers Kotlin will infer the type
    val oneMillon = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexByte = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

}