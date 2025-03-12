import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while(true){
        val input = reader.readLine() ?: break
        val (a, b) = input.split(" ").map { it.toLong() }
        writer.write("${a + b}\n")
    }

    writer.flush()
    writer.close()
}