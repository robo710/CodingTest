import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val s = reader.readLine()
    val set = mutableSetOf<String>()

    for (i in s.indices){
        for (j in i + 1..s.length){
            set.add(s.substring(i, j))
        }
    }

    writer.write("${set.size}")

    writer.flush()
    writer.close()
}