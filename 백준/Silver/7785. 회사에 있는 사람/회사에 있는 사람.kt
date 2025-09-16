import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val map = mutableMapOf<String, String>()

    repeat(n) {
        val (key, value) = reader.readLine().split(" ")
        if (value == "enter") {
            map[key] = value
        } else {
            map[key]?.let { map.remove(key) }
        }
    }

    writer.write(map.keys.sortedDescending().joinToString("\n"))

    writer.flush()
    writer.close()
}