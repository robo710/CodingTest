import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val narr = reader.readLine().split(" ").map { it.toInt() }

    val m = reader.readLine().toInt()
    val marr = reader.readLine().split(" ").map { it.toInt() }

    var answer = mutableMapOf<Int, Int>()

    narr.forEach{ i ->
        answer[i] = answer.getOrDefault(i, 1)
    }

    marr.forEach{ i ->
        writer.write("${answer.getOrDefault(i, 0)} ")
    }

    writer.flush()
    writer.close()
}