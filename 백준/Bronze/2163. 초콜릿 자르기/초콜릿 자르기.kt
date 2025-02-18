import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = reader.readLine()!!.split(" ").map { it.toLong() }

    print(n * m - 1L)
}