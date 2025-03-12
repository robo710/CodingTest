import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    for (i in 1..n) {
        val (a, b) = reader.readLine().split(" ")
        val c = b.toCharArray()

        for (j in 0..<c.size) {
            for (i in 1..a.toInt()) {
                writer.write("${c[j]}")
            }
        }
        writer.newLine()
    }

    writer.flush()
    writer.close()
}