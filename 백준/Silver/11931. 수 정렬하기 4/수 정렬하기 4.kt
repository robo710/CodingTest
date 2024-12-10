import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = Array(n) { reader.readLine().toInt() }

    a.sortDescending()

    a.forEach { writer.write("$it\n") }
    writer.flush()
    writer.close()
}