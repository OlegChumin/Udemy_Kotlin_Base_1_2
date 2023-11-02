package lesson_03

fun main() {
    // конкатенация строк
    val greetings = "Здравствуйте"
    val space = ' '
    val exclamationMark = '!'
    val questionText = "Какой будет ваш главный вопрос"
    val questionMark = '?'

    println(greetings + exclamationMark + space + questionText + space + questionMark)

    // интерполяция строк
    println("$greetings$exclamationMark$space$questionText$space$questionMark")
    println()

    val userName = "Звездный Лорд"
    println("$greetings$exclamationMark$space$userName$space$questionText$space$questionMark")
    println()

    val multiString = """"
            | Line 1
        | Line 2
            | Line 3
    """.trimMargin()
    println(multiString)

    val multuString2 = """
             Line 1
         Line 2
            Line 3
    """.trimIndent()
    println(multuString2)

    val multiString3 = """"
            >Line 1
          >Line 2
               >Line 3
    """.trimMargin(">")
    println(multiString3)

}