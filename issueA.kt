import java.util.Scanner
fun saveVenya(sizeOfPool1 : Int, sizeOfPool2: Int, distanceToShorter: Int, distanceToLonger: Int ): Int {
    return minOf(distanceToShorter, distanceToLonger, minOf(sizeOfPool1, sizeOfPool2)-distanceToLonger, maxOf(sizeOfPool1, sizeOfPool2)-distanceToShorter)
}

fun main () {
    val reader = Scanner(System.`in`)
    print("Введите размеры бассейна (через пробел): ")
    var size1 = reader.nextInt()
    var size2 = reader.nextInt()

    print("Введите расстояния до длинного и короткого бортов (через пробел): ")
    var distToLong = reader.nextInt()
    var distToShort = reader.nextInt()

    println(saveVenya(size1, size2, distToShort, distToLong))
}