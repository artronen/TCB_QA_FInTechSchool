import java.util.*

fun main () {
    val reader = Scanner(System.`in`)
    print("Введите обфусцированный код: ")
    var inputedCode: String = reader.next()
    println("Введите код для поиска :")
    val searchableCode : String = reader.next()
    print("${inputedCode.split(searchableCode).size-1}")
}
