fun main() {
    var input = readLine()!!.toInt()

    while (input != 1) {
        print("$input ")
        if (input % 2 == 0) {
            input /= 2
        } else {
            input *= 3
            input += 1
        }
    }
    if (input == 1){
        print(1)
    }
}