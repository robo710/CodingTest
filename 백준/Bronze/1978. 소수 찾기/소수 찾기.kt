import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = reader.readLine().split(" ").map { it.toInt() }
    var answer = 0

    for (i in 0..<n){
        for (j in 2..a[i]){

            if (a[i] == j){
                answer++
            } else if(a[i] % j == 0) {
                break
            }
        }
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}