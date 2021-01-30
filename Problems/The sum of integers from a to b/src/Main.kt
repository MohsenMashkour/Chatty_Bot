import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()
    var res = 0
    for (i in a..b) {
        res += i
    }
    println(res)
}