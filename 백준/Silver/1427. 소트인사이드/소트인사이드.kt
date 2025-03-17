import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().chunked(1).map { it.toInt() }

    writer.write(n.sortedDescending().joinToString(""))

    writer.flush()
    writer.close()
}