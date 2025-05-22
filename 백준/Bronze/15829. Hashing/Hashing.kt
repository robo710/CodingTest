import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = reader.readLine()
    var answer = 0L
    var pow = 1L
    val mod = 1234567891

    repeat(n) { i ->
        val value = a[i] - 'a' + 1
        answer = (answer + value * pow % mod) % mod
        pow = (pow * 31) % mod
    }

    writer.write("$answer")
    writer.flush()
    writer.close()
}