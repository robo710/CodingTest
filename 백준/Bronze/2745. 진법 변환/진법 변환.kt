import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, b) = reader.readLine().split(" ")
    val a = n.toInt(b.toInt())
    writer.write("$a")

    writer.flush()
    writer.close()
}