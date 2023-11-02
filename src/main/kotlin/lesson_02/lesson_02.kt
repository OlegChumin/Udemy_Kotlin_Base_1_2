package lesson_02

fun main() {
    val a = 5
    val b = 7
    val sum = a + b

    val c1 = 888
    val c: Int

    println(a + b)
    println(sum)

    println(10 / 3)

    val intNum1 = 10
    val intNum2 = 3
    println(intNum1 / intNum2)

    val floatNum1 = 10f
    val floatNum2 = 3f
    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val dooubleNum2: Double = 3.0
    println(doubleNum1 / dooubleNum2)

    // остаток от деления %
    println(10 % 3)
    println(10 % 2)
    val intNumber = 10
    println(intNumber.rem(2))

    println(intNum1 + floatNum1)
    println(intNum1 + floatNum1 + doubleNum1)

    val d = intNum2 + floatNum1
    println(d::class.simpleName)

    //
    var counter = 0
    counter = counter + 1
    counter += 1
    counter++


    counter = counter - 1
    counter -= 1
    counter--

    ++counter
    --counter

    var counter1 = 5
    val result1 = ++counter1 // counter2 увеличивается на 1, затем result1 равен 6

    var counter2 = 5
    val result2 = counter2++ // result2 равен 5, затем counter2 увеличивается на 1

    // операторы сравнения
    println("a = $a, b = $b")
    println("a > b ${a > b}")
    println("a >= b ${a >= b}")
    println("a < b ${a < b}")
    println("a <= b ${a <= b}")
    println("a != b ${a != b}")
    println("a == b ${a == b}")

}