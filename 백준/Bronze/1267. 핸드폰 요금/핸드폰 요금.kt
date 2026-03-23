import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val time = reader.readLine().toInt()
    val a = reader.readLine()!!.split(" ").map { it.toInt() }
    var y = 0
    var m = 0
    for (i in 0..<time){
        y += if(a[i] % 30 == 29){
            (a[i] / 30) * 10
        } else {
            (a[i] / 30 + 1) * 10
        }
        m += if(a[i] % 60 == 59){
            (a[i] / 60) * 15
        } else {
            (a[i] / 60 + 1) * 15
        }
    }
    when{
        y == m -> writer.write("Y M $y")
        y < m -> writer.write("Y $y")
        else -> writer.write("M $m")
    }

    writer.flush()
    writer.close()
}