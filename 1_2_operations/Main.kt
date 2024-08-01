//TIP Documentation Page https://kotlinlang.org/docs/home.html
fun main() {
    val a = 10
    val b = 5

    //TIP <b>Arithmetic operations</b>
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    val remainder = a % b

    var sumOP = a.plus(b)
    val differenceOP = a.minus(b)
    val productOP = a.times(b)
    val quotientOP = a.div(b)
    val remainderOP = a.rem(b)



    //TIP <b>Increment and Decrement</b>
    var x = 5
    ++x // x = 6
    x++ // x = 7
    x-- // x = 6
    --x // x = 5

    x.inc()
    x.dec()

    //TIP <b>Assignment Operators</b>

    var sumAssigned = a
    sumAssigned += b
    var differenceAssigned = a
    differenceAssigned -= b
    var productAssigned = a
    productAssigned *= b
    var quotientAssigned = a
    quotientAssigned /= b
    var remainderAssigned = a
    remainderAssigned %= b

    //TIP <b>Comparison operations</b>
    val isEqual = a == b
    val isNotEqual = a != b
    val isGreater = a > b
    val isLess = a < b
    val isGreaterOrEqual = a >= b
    val isLessOrEqual = a <= b

    val isEqualOP = a.equals(b)
    //TIP <b>Logical operations</b>
    var bothTrue = isEqual && isGreater
    bothTrue = isEqual.and(isGreater)
    var atLeastOneTrue = isEqual || isGreater
    atLeastOneTrue = isEqual.or(isGreater)


}