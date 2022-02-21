import java.util.*

fun checkIsScammer(name: String, surname : String): Boolean {
    if (name.length != surname.length) {
        return false
    }
    val nameAsSet = name.toSet()
    val surnameAsSet = name.toSet()
    if (nameAsSet == surnameAsSet) {
        return true
    }
    return false
}

fun main () {
    val reader = Scanner(System.`in`)
    print("Введите имя: ")
    val name: String = reader.next().uppercase(Locale.getDefault())
    val surname : String = reader.next()
    print(when(checkIsScammer(name, surname)) {
        true -> "Yes"
        false -> "No"
    }
        )
}