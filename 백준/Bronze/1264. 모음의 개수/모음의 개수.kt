import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var a = reader.readLine()
    while (a != "#"){
        writer.write("${a.count { it in setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U') }}\n")
        a = reader.readLine()
    }

    writer.flush()
    writer.close()
}