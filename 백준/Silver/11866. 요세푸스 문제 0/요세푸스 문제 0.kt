import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = reader.readLine().split(" ").map { it.toInt() }

    val circle = MutableList<Int>(n) { i -> i + 1 }
    val answer = mutableListOf<Int>()

    var index = 0

    for (i in 0..<n){
        index = (index + k - 1) % circle.size
        answer.add(circle[index])
        circle.removeAt(index)
    }

    writer.write(answer.joinToString(", ", "<", ">"))
    writer.flush()
    writer.close()
}