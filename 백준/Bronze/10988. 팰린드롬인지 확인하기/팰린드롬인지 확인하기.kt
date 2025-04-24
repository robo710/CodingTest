import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val s1 = reader.readLine()
    val s2 = s1.reversed()

    if (s1 == s2){
        writer.write("1")
    } else{
        writer.write("0")
    }

    writer.flush()
    writer.close()
}