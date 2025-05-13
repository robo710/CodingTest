import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }
    val card = reader.readLine().split(" ").map { it.toLong() }
    var answer = 0L

    for(i in 0..< n - 2){
        for (j in i + 1..<n - 1){
            for (k in j + 1..<n){
                if (card[i] + card[j] + card[k] > answer && card[i] + card[j] + card[k] <= m){
                    answer = card[i] + card[j] + card[k]
                }
            }
        }
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}