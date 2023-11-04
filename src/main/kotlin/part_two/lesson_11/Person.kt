package part_two.lesson_11

class Person(firstName: String, lastName: String) {
    // Поля, определенные в первичном конструкторе
    val firstName: String = firstName
    val lastName: String = lastName
}

fun main() {
    // Создание экземпляра класса и инициализация полей
    val person = Person("John", "Doe")
    
    // Доступ к полям
    println("First Name: ${person.firstName}")
    println("Last Name: ${person.lastName}")
}
