fun getLastDigit(a: Int): Int {
    var lastDigit = a % 10
    if (lastDigit < 0) lastDigit *= -1
    return lastDigit
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}