import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var (d, h, w) = reader.readLine()!!.split(" ").map { it.toDouble() }
    d *= d
    val h1 = h * h
    val w1 = w * w
    var answer = d / (h1 + w1)
    answer = Math.sqrt(answer)
    h *= answer
    w *= answer
    writer.write("${h.toLong()} ${w.toLong()}")

    writer.flush()
    writer.close()
}