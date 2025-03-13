import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    var answer = 0

    for (i in 0..<n){
        val a = reader.readLine().replace("X", " ").split(" ")
        for (j in a.indices) {
            for (k in 1 .. a[j].length){
                answer += k
            }
        }
        writer.write("$answer\n")
        answer = 0
    }

    writer.flush()
    writer.close()
}