import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var a = reader.readLine().split(" ").map { it.toInt() }

    a = a.sorted()
    writer.write("${a[1]}")

    writer.flush()
    writer.close()
}