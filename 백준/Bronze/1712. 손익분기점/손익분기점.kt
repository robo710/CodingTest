import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0

    var (a, b, c) = reader.readLine().split(" ").map { it.toInt() }

    if (b >= c){
        writer.write("-1")
    } else {
        while (a >= 0){
            a -= c - b
            answer++
        }
        writer.write("$answer")
    }

    writer.flush()
    writer.close()
}