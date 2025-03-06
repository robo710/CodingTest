import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a:Long
    var n = reader.readLine()
    var f = reader.readLine().toLong()

    n = n.substring(0, n.length - 2)
    a = n.toLong() * 100 % f
    f -= a
    when{
        a == 0L -> writer.write("00")
        f < 10 -> writer.write("0$f")
        else -> writer.write("$f")
    }

    writer.flush()
    writer.close()
}