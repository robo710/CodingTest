import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0

    val a = reader.readLine().toCharArray()
    if (a.size > max) max = a.size
    val b = reader.readLine().toCharArray()
    if (b.size > max) max = b.size
    val c = reader.readLine().toCharArray()
    if (c.size > max) max = c.size
    val d = reader.readLine().toCharArray()
    if (d.size > max) max = d.size
    val e = reader.readLine().toCharArray()
    if (e.size > max) max = e.size

    for (i in 0 until max) {
        if (i < a.size) writer.write("${a[i]}")
        if (i < b.size) writer.write("${b[i]}")
        if (i < c.size) writer.write("${c[i]}")
        if (i < d.size) writer.write("${d[i]}")
        if (i < e.size) writer.write("${e[i]}")
    }

    writer.flush()
    writer.close()
}