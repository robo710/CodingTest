import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = reader.readLine().split(" ").map { it.reversed() }
    if (a.toLong() > b.toLong()){
        writer.write(a)
    } else{
        writer.write(b)
    }

    writer.flush()
    writer.close()
}