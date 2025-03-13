import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val x = reader.readLine().toInt()
    val n = reader.readLine().toInt()
    var sum = 0

    for (i in 1 ..n){
        val (a,b) = reader.readLine().split(" ").map { it.toInt() }
        sum += a * b
    }
    when(x){
        sum -> writer.write("Yes")
        else -> writer.write("No")
    }

    writer.flush()
    writer.close()
}