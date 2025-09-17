import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val a = reader.readLine().split(" ").map { it.toInt() }.toSet()
    val b = reader.readLine().split(" ").map { it.toInt() }.toSet()

    var result = 0
    result += (a - b).size
    result += (b - a).size

    writer.write("$result")

    writer.flush()
    writer.close()
}