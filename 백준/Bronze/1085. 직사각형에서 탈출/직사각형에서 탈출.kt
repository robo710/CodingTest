import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = reader.readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    a[2] -= a[0]
    a[3] -= a[1]

    writer.write("${a.min()}")
    writer.flush()
    writer.close()
}