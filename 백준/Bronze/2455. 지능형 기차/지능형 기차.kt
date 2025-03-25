import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var human = 0
    var max = 0

    for (i in 0..3) {
        val (a, b) = reader.readLine().split(" ").map { it.toInt() }
        human -= a
        human += b
        if (human > max){
            max = human
        }
    }

    writer.write("$max")

    writer.flush()
    writer.close()
}