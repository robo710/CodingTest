import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))


    val (a, b, c) = reader.readLine().split(" ").map { it.toInt() }
    val max = maxOf(a, b, c)
    val num = (a + b + c) - max
    if (num - max > 0){
        writer.write("${num + max}")
    } else {
        writer.write("${num + num - 1}")
    }

    writer.flush()
    writer.close()
}