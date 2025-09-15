import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = reader.readLine().split(" ").map { it.toInt() }
    val numbers = reader.readLine().split(" ").map { it.toInt()}.sorted()
    writer.write("${numbers[n - k]}\n")

    writer.flush()
    writer.close()
}