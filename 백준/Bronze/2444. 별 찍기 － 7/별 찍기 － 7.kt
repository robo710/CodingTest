import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()

    for (i in 1..<n*2){
        if (i < n) {
            for (j in i..< n) {
                writer.write(" ")
            }
            for (j in 1..< i * 2) {
                writer.write("*")
            }
        }
        else if (i == n){
            for (j in 1..< n * 2){
                writer.write("*")
            }
        }
        else{
            for (j in n..< i) {
                writer.write(" ")
            }
            for (j in 0..< (n * 2 - i) + (n * 2 - i - 1)) {
                writer.write("*")
            }
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
}