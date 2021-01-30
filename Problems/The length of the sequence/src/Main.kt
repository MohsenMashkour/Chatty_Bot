fun main() {
    var counter = 0
    do {
        val number = readLine()!!.toInt()
        counter++

    }while (number != 0)

    println(counter - 1)
}