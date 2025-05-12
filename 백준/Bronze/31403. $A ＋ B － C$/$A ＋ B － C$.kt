import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = reader.readLine().toInt()
    val b = reader.readLine().toInt()
    val c = reader.readLine().toInt()

    writer.write("${a + b - c}\n")
    writer.write("${(a.toString() + b.toString()).toInt() - c}")


    writer.flush()
    writer.close()
}