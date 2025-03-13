import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = reader.readLine().split(" ").map { it.toInt() }
    val v = reader.readLine().toInt()
    var answer = 0

    for (i in 0..<n){
        if(a[i] == v){
            answer++
        }
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}