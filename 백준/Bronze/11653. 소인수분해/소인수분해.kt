import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var n = reader.readLine().toInt()
    var dec = 2

    while(n > 1) {
        if(n % dec == 0) {
            writer.write("$dec\n")
            n /= dec
        } else {
            dec++
        }
    }

    writer.flush()
    writer.close()
}