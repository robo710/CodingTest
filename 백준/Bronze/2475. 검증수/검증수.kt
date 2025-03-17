import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = reader.readLine().split(" ").map { it.toInt() }
    var answer = 0

    for(i in 0..4){
        answer += a[i] * a[i]
    }
    writer.write("${answer % 10}")

    writer.flush()
    writer.close()
}