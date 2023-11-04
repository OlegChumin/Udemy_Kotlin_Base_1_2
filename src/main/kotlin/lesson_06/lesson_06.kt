package lesson_06

fun main() {
    // while do while
    var counter = 5

//    while (counter > 0) {
//        println("Реклама закончится через ${counter--}")
//        Thread.sleep(1000)
//    }
//
//    counter = 5
//    print("Реклама закончится через ")
//    while (counter > 0) {
//        print("${counter--} ")
//        Thread.sleep(1000)
//    }

    counter = 9

    println("Реклама закончится через ")
    while (counter > 0) {
        // Генерируем строку для текущего значения счетчика
        val counterText = " $counter сек"
        print("\r$counterText")  // Возврат каретки и выводим новое значение
        Thread.sleep(1000)  // Подождем 1 секунду
        counter--
    }

    // После завершения цикла, можно вывести сообщение о завершении рекламы
    println("\rРеклама завершилась!")

    println("Реклама закончится через ")

    counter = 5
    do {
        // Генерируем строку для текущего значения счетчика
        val counterText = " $counter сек"
        print("\r$counterText")  // Возврат каретки и выводим новое значение
        Thread.sleep(1000)  // Подождем 1 секунду
        counter--
    } while (counter > 0)
}