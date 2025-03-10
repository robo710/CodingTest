import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, l, d) = reader.readLine().split(" ").map { it.toInt() }

    val time = n * l + (n - 1) * 5

    var a = 0
    while (a <= time) {
        if ((a % (l + 5)) >= l) {
            writer.write("$a")
            writer.flush()
            writer.close()
            return
        }
        a += d
    }

    writer.write("$a")
    writer.flush()
    writer.close()
}
