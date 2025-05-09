import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, v) = reader.readLine().split(" ").map { it.toInt() }

    val day = if ((v - a) % (a - b) == 0){
        (v - a) / (a - b)
    } else{
        (v - a) / (a - b) + 1
    }

    writer.write("${day + 1}")

    writer.flush()
    writer.close()
}