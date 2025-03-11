import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, x) = reader.readLine().split(" ").map { it.toLong() }

    val a = reader.readLine().split(" ").map { it.toLong() }
    for (i in 0..<n){
        when{
            x > a[i.toInt()] -> writer.write("${a[i.toInt()]} ")
        }
    }

    writer.flush()
    writer.close()
}