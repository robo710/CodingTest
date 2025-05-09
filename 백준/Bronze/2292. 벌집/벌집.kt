import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var n = reader.readLine().toLong()
    var time = 0
    when(n){
        1L -> writer.write("1")
        else -> {
            n -= 1
            while (true) {
                if (n > 0) {
                    time += 1
                    n -= 6 * time
                } else {
                    writer.write("${time + 1}")
                    break
                }
            }
        }
    }

    writer.flush()
    writer.close()
}