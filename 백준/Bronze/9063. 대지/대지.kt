import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    when (n) {
        1 -> {
            writer.write("0")
            writer.flush()
            writer.close()
            return
        }
    }

    val arr = Array(n) { IntArray(2) }
    for (i in 0 ..< n) {
        val (x, y) = reader.readLine().split(" ").map { it.toInt() }
        arr[i][0] = x
        arr[i][1] = y
    }

    val x = arr.map { it[0] }
    val y = arr.map { it[1] }

    val minX = x.minOrNull()!!
    val maxX = x.maxOrNull()!!
    val minY = y.minOrNull()!!
    val maxY = y.maxOrNull()!!

    writer.write("${(maxX - minX) * (maxY - minY)}")

    writer.flush()
    writer.close()
}