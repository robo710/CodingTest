import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }
    val set1 = mutableSetOf<String>()

    for (i in 1..n){
        set1.add(reader.readLine())
    }

    var answer = 0
    for (i in 1..m){
        val s = reader.readLine()
        if(s in set1){
            answer++
        }
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}