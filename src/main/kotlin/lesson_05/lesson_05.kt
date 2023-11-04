package lesson_05

const val AGE_OF_MAGORITY = 18

fun main() {

    val userAge = readln().toInt()

    if (userAge >= AGE_OF_MAGORITY) {
        println("Показать экран со скрытым контентом")
    } else if (userAge == 16 || userAge == 17) {
        println("Показать экран с ограниченным контентом")
    } else {
        println("Вернуть на главный экран приложения")
    }

    fun textResult() = if (userAge >= AGE_OF_MAGORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуть на главный экран приложения"

    when {
        userAge == 10 -> println("Ввели число $userAge")
        userAge == 20 -> println("Ввели число $userAge")
        userAge == 42 -> println("Ввели число $userAge")
        else -> println("Ввели другое число")
    }

    val consoleNumber = when(userAge) {
        10 -> println("Ввели число $userAge")
        20 -> println("Ввели число $userAge")
        42 -> println("Ввели число $userAge")
        else -> println("Ввели другое число")
    }
    println()
    println()

    val consoleNumber2 = when(userAge) {
        10 -> {
            println("Дополнительное действие если ввели $userAge")
            "Ввели число $userAge"}
        20 -> "Ввели число $userAge"
        42 -> "Ввели число $userAge"
        else -> "Ввели другое число"
    }
    println(consoleNumber2)

}