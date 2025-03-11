import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toLong()
    writer.write("$n * 1 = ${n * 1}\n")
    writer.write("$n * 2 = ${n * 2}\n")
    writer.write("$n * 3 = ${n * 3}\n")
    writer.write("$n * 4 = ${n * 4}\n")
    writer.write("$n * 5 = ${n * 5}\n")
    writer.write("$n * 6 = ${n * 6}\n")
    writer.write("$n * 7 = ${n * 7}\n")
    writer.write("$n * 8 = ${n * 8}\n")
    writer.write("$n * 9 = ${n * 9}")

    writer.flush()
    writer.close()
}