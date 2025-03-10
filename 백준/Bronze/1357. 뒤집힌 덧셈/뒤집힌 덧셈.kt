import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var answer = 0L

    val (x, y) = reader.readLine()!!.split(" ").map { it.toLong() }

    answer = rev(rev(x) + rev(y))

    writer.write("$answer")

    writer.flush()
    writer.close()
}

fun rev(x:Long):Long {
    var a = x
    var b = 0L
    while (a != 0L){
        b = b * 10 + a % 10
        a /= 10
    }
    return b
}