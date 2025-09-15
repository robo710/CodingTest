import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    var answer = 1L

    for (i in 1..n){
        answer *= i
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}