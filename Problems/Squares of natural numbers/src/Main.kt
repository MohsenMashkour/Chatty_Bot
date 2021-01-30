fun main() {
    val inpt = readLine()!!.toInt()
    var counter = 1
    var num2 = 0

    while (num2 < inpt) {
        num2 = counter * counter
        if (num2 > inpt) {
            return
        }
        println(num2)
        counter++

    }
}