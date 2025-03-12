import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toLong()

    for (i in 1..n){
        val (a, b) = reader.readLine().split(" ").map { it.toLong() }

        writer.write("Case #$i: $a + $b = ${a + b}\n")
    }

    writer.flush()
    writer.close()
}