import java.util.*

fun main() {
    val totallMoney = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)
    var next = 0
    var next1 = 0
   // println(totallMoney)

    while (scanner.hasNext()) {
        next += scanner.next().toInt()

        if (next > totallMoney){

            //println(next)
           // println(next1)
            val rest = next - next1
            print("Error, insufficient funds for the purchase. You have $rest, but you need $next1.")

            return
        }
        next1 += next
    }
   if (next < totallMoney){
       val rest = totallMoney - next
       println("Thank you for choosing us to manage your account! You have $rest money.")
   } else if (next == totallMoney) {
       print("Thank you for choosing us to manage your account! You have 0 money.")
   }



}