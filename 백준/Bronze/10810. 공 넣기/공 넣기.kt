import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }
    val basket = mutableListOf<Int>()
    for (i in 1..n){
        basket.add(0)
    }

    for (i in 1..m){
        val (a, b, c) = reader.readLine().split(" ").map { it.toInt() }
        for (j in a-1..<b){
            basket[j] = c
        }
    }

    basket.forEach {
        writer.write("$it ")
    }
    writer.flush()
    writer.close()
}