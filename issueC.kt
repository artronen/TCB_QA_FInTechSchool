import java.util.*

fun checkIsScammer(name: String, surname : String): Boolean {
    if (name.length != surname.length) {
        return false
    }
    val nameAsSet = name.toList()
    val surnameAsSet = surname.toList()
    if (nameAsSet == surnameAsSet) {
        return true
    }
    return false
}

fun main () {
    val reader = Scanner(System.`in`)
    print("имя и фамилию жулика: ")
    val name: String = reader.next().uppercase()
    val surname : String = reader.next().uppercase()
    print(when(checkIsScammer(name, surname)) {
        true -> "Yes"
        false -> "No"
    }
    )
}
