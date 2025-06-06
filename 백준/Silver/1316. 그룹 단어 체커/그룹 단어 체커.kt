import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    val n = reader.readLine().toInt()
    val a = mutableListOf<String>()

    for (i in 1..n){
        val s = reader.readLine().chunked(1)
        if (s.size == 1){
            answer++
        } else {
            for (j in 1..<s.size) {
                if (s[j - 1] != s[j]) {
                    a.add(s[j - 1])
                    if (a.contains(s[j])) {
                        break
                    }
                }
                if (j == s.size - 1) {
                    answer++
                }
            }
        }
        a.clear()
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}