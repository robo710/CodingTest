import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val t = reader.readLine().toLong()

    for (i in 1..t){
        val (a, b) = reader.readLine().split(" ").map { it.toLong() }
        writer.write("${a + b}\n")
    }

    writer.flush()
    writer.close()
}