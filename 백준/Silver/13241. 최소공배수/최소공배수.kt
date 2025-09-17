import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = reader.readLine().split(" ").map { it.toLong() }

    gcd(a, b)
    writer.write("${(a * b) / gcd(a, b)}\n")

    writer.flush()
    writer.close()
}

fun gcd(a: Long, b: Long): Long = if (b != 0L) gcd(b, a % b) else a