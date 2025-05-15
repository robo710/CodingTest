import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while(true){
        var n = reader.readLine().toInt()
        if (n == 0){
            break
        }
        val m = n
        n = n.toString().reversed().toInt()
        if (n == m){
            writer.write("yes\n")
        } else {
            writer.write("no\n")
        }
    }

    writer.flush()
    writer.close()
}