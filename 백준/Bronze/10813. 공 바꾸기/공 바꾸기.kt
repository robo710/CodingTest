import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine()!!.split(" ").map { it.toInt() }
    val basket = mutableListOf<Int>()
    var temp = 0

    for (i in 1..n){
        basket.add(i)
    }

    for (i in 1..m){
        val (a, b) = reader.readLine()!!.split(" ").map { it.toInt() }
        temp = basket[a - 1]
        basket[a - 1] = basket[b - 1]
        basket[b - 1] = temp
    }
    for (i in 0..<n) {
        writer.write("${basket[i]} ")
    }

    writer.flush()
    writer.close()
}