import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (ac, ap) = reader.readLine().split(" ").map { it.toLong() }
    val (bc, bp) = reader.readLine().split(" ").map { it.toLong() }

    val a = ap * bc + bp * ac
    val b = ap * bp
    writer.write("${a / gcd(a, b)} ${b / gcd(a, b)}")

    writer.flush()
    writer.close()
}

fun gcd(a: Long, b: Long): Long = if (b != 0L) gcd(b, a % b) else a