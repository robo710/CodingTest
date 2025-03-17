import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().split(" ").map { it.toInt() }
    var answer = 0
    for (i in 0..6) {
        if (n[i] < n[i + 1]) {
            answer++
        } else if (n[i] > n[i + 1]) {
            answer--
        }
    }
    when (answer) {
        7 -> writer.write("ascending")
        -7 -> writer.write("descending")
        else -> writer.write("mixed")
    }

    writer.flush()
    writer.close()
}