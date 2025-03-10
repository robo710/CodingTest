import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toLong()
    for (i in 0..<n){
        for (j in 0..<n){
            writer.write("*")
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
}