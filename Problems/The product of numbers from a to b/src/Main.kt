fun main() {
    val a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var p : Long = 1
    for (i in a..--b) {
        p *= i
    }
    println(p)
}