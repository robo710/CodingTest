import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val answer = Array(10) { 0L }
    var sum = 1L

    for (i in 0..2){
        val n = reader.readLine().toInt()
        sum *= n
    }

    val a = sum.toString().chunked(1)

    for (i in a.indices){
        answer[a[i].toInt()] += 1L
    }

    for (i in 0..9)
        writer.write("${answer[i]}\n")

    writer.flush()
    writer.close()
}