fun main() {
    val inpt = readLine()!!.toInt()
    var counter = 1
    var num2 = 0
   // var str = ""

    /*for (i in 0..inpt)
    { // This will loop 5 times
        for (j in 0 until i)
        { //This will loop i times
            str += "$i "
        }
    }

     */
    while (counter <= inpt){
    repeat(num2){
        println("$num2 ")
        counter++

        if (counter > inpt) {
            return
        }
    }
    num2++


}


}