import java.util.*

fun main () {
    val reader = Scanner(System.`in`)
    print("Ставка: ")
    val stavka: Short = reader.nextShort()
    print("Рублей: ")
    var rurs : Short = reader.nextShort()
    print("Копеек: ")
    var cents : Short = reader.nextShort()
    print("Срок вклада в годах: ")
    val years : Short = reader.nextShort()
    for (year in 1..years) {
        var money = rurs * 100+ cents
        var amountAtYearEnd = (money +  money.toDouble() * stavka.toDouble()  / 100).toInt().toShort()
        rurs = (amountAtYearEnd / 100).toShort()
        cents = (amountAtYearEnd % 100).toShort()
    }
    print("$rurs $cents")
}
