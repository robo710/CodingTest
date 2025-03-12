import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0L
    val x = reader.readLine().toLong()
    var a = reader.readLine().split(" ").map { it.toLong() }
    var b = reader.readLine().split(" ").map { it.toLong() }

    a = a.sorted()
    b = b.sorted().reversed()
    for (i in 0..<x){
        answer += a[i.toInt()] * b[i.toInt()]
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}