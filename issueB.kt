import java.util.Scanner

fun getMeCountOfCriticals(arr : List<Byte>):Short {
    var sumCriticalForFixing :Short = 0
    for (item in 1 until arr.size-1) {
        if ((arr[item] > arr[item-1]) && (arr[item] > arr[item+1])) {
            sumCriticalForFixing++
        }
    }
    return sumCriticalForFixing

}
fun main () {
    val reader = Scanner(System.`in`)
    print("Введите количество найденных багов: ")
    val amountOfBugs: Short = reader.nextShort()
    print("у Васи есть ${amountOfBugs} багов с приоритетами (пишите через пробел): ")
    val myMut = mutableListOf<Byte>()
    for (item in 0 until amountOfBugs) {
        myMut.add(reader.nextByte())
    }
    println(getMeCountOfCriticals(myMut))
}