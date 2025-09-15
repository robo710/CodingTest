import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val dot1 = reader.readLine().split(" ").map { it.toInt() }
    val dot2 = reader.readLine().split(" ").map { it.toInt() }
    val dot3 = reader.readLine().split(" ").map { it.toInt() }

    for (i in 0..<2) {
        if (dot1[i] == dot2[i]) {
            writer.write("${dot3[i]} ")
        } else if (dot1[i] == dot3[i]) {
            writer.write("${dot2[i]} ")
        } else {
            writer.write("${dot1[i]} ")
        }
    }

    writer.flush()
    writer.close()
}