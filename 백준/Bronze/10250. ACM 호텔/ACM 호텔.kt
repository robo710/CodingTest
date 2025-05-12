import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val t = reader.readLine().toInt()
    var answer = 0

    for (i in 1..t){
        val (h, w, n) = reader.readLine().split(" ").map { it.toInt() }
        answer += (n - 1) / h + 1
        answer += ((n - 1) % h + 1) * 100
        writer.write("$answer\n")
        answer = 0
    }

    writer.flush()
    writer.close()
}