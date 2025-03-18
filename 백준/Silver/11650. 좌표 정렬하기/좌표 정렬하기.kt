import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()

    val answer = mutableListOf<Pair<Int, Int>>()

    for (i in 0..<n){
        val (x, y) = reader.readLine().split(" ").map { it.toInt() }
        answer.add(x to y)
    }

    answer.sortWith(compareBy { it.second })
    answer.sortWith(compareBy { it.first })
    for ((x, y) in answer) {
        writer.write("$x $y\n")
    }

    writer.flush()
    writer.close()
}