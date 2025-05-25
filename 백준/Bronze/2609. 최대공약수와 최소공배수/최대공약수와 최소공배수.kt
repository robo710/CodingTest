import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = reader.readLine().split(" ").map { it.toInt() }

    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    val gcd = x

    writer.write("$gcd\n")
    writer.write("${a * b / gcd}")

    writer.flush()
    writer.close()
}