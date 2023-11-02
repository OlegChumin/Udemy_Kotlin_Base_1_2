package lesson_04

fun main() {
    // логические операторы
    // операторы сравнения
    val a = 1 + 1
    val b = (1 == 1)

    // <, >, >=, <=, == !=
    // === !== (операторы ссылочного сравнения)

    val userAge = 42
    var comparisonResult: Boolean = false
    println(comparisonResult)
    comparisonResult = AGE_OF_MAJORITY <= userAge && userAge <= RETIREMENT_AGE
    println("Результат проверки пользователя $comparisonResult")
    // < > <= >= == !=
    // &&, ||, !
    comparisonResult = userAge in AGE_OF_MAJORITY ..RETIREMENT_AGE
    println("Результат проверки пользователя $comparisonResult")

}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65