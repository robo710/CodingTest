import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toLong()
    val list = reader.readLine().split(" ").map { it.toLong() }

    writer.write("${list.min()} ${list.max()}")

    writer.flush()
    writer.close()
}