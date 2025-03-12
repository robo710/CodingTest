import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()

    var a = reader.readLine().split(" ").map { it.toDouble() }.toMutableList()

    val max = a.max()

    for (i in 0..<n){
        a[i] = a[i] / max * 100
    }

    writer.write("${a.sum() / n}")

    writer.flush()
    writer.close()
}