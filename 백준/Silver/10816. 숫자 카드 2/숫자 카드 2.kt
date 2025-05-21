import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, Int>()

    val n = reader.readLine().toInt()
    val a = reader.readLine().split(" ").map { it.toInt() }

    val m = reader.readLine().toInt()
    val b = reader.readLine().split(" ").map { it.toInt() }

    a.forEach{ i ->
        map[i] = map.getOrDefault(i, 0) + 1
    }

    b.forEach { i ->
        writer.write("${map.getOrDefault(i, 0)} ")
    }

    writer.flush()
    writer.close()
}