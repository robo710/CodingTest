fun main() {
    val n = readln().toInt()
    var count = 0
    var check = 5
    while (n / check > 0){
        count += n / check
        check *= 5
    }
    println(count)
}