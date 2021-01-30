//import java.util.Scanner
fun main() {
   // val scanner = Scanner(System.`in`)
    val input1 = readLine()!!.toInt()
    //var input2 = input1

    var counter = 1
    //var num2 = 1
    do{
        val input2 = readLine()!!.toInt()
        counter++
    } while(input1 < input2)


    print("$input1 ${counter - 1}")
}