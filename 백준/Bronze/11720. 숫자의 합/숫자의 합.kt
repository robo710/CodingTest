import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0L

    val n = reader.readLine().toLong()
    val a = reader.readLine().chunked(1)

    for (i in 0..<n){
        answer += a[i.toInt()].toLong()
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}