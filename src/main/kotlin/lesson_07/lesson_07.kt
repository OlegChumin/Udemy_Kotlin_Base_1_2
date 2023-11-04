package lesson_07

fun main() {
    // диапазоны
    val range = 42..442
    val range2 = 42 until 442
    val range3 = 42..<442
    val range4 = 'a'..'z'
    val range5 = 42.1..442.5 // невозможно итерироваться
    val range6 = 42.1F..442.5F // невозможно итерироваться

    val range7 = 42..442 step 2 // по умолчанию step == 1
    val range8 = 422 downTo 42 step 2 // по умолчанию step == 1

    println(52 in range)
    println(52 !in range)

    //for (если количество итераций известно используем for
    for (i in 5 downTo 1) {
        print("\r")
        print("Реклама закончится через $i")
        Thread.sleep(500)
    }
    println()

    for (i in range2 step 16) {
        print("$i ")
    }
    println()

    //break
    println("break")
    for (i in 5 downTo 1) {
        if (i == 3) {
            println()
            println("Пользователь нажал на кнопку \"Пропустить\"")
            break
        }
        print("\r")
        print("Реклама закончится через $i")
        Thread.sleep(500)
    }
    println()

    //continue
    println("continue")
    for (i in 5 downTo 1) {
        if (i == 3) {
            println()
            println("i=3 не будет распечатана")
            continue
        }
        print("\r")
        print("Реклама закончится через $i")
        Thread.sleep(500)
    }
    println()
    println("Продолжение работы программы вне цикла - после continue")


    //return
    println("return")
    for (i in 5 downTo 1) {
        if (i == 3) {
            println()
            println("завершение работы main")
            return
        }
        print("\r")
        print("Реклама закончится через $i")
        Thread.sleep(500)
    }
    println()

    println("Продолжение работы программы вне цикла - после return")


}