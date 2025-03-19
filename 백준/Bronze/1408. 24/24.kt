import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val t1 = reader.readLine().split(":").map { it.toInt() }
    val t2 = reader.readLine().split(":").map { it.toInt() }

    var h = t2[0] - t1[0]
    var m = t2[1] - t1[1]
    var s = t2[2] - t1[2]

    if (s < 0) {
        s += 60
        m -= 1
    }
    if (m < 0) {
        m += 60
        h -= 1
    }
    if (h < 0) {
        h += 24
    }

    writer.write("${listOf(h, m, s).joinToString(":") { it.toString().padStart(2, '0') }}\n")

    writer.flush()
    writer.close()
}