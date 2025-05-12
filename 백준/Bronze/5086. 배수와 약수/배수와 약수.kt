import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    do {
        val (a, b) = reader.readLine().split(" ").map { it.toInt() }
        when{
            a == 0 && b == 0 -> break
            b % a == 0 -> writer.write("factor\n")
            a / b > 0 && a % b == 0 -> writer.write("multiple\n")
            else -> writer.write("neither\n")
        }
    }
    while (true)

    writer.flush()
    writer.close()
}