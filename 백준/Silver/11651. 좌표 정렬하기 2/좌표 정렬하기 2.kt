import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val coordinate = Array(n, {IntArray(2)})

    repeat(n){ i ->
        val (x, y) = reader.readLine().split(" ").map { it.toInt() }
        coordinate[i][0] = x
        coordinate[i][1] = y
    }

    coordinate.sortWith(compareBy { it[0] })
    coordinate.sortWith(compareBy { it[1] })

    repeat(n){ i ->
        writer.write("${coordinate[i][0]} ")
        writer.write("${coordinate[i][1]}\n")
    }

    writer.flush()
    writer.close()
}