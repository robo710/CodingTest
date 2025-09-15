import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val paper = Array(100) { IntArray(100) { 0 } }
    for (i in 1..n) {
        val (a, b) = reader.readLine().split(" ").map { it.toInt() }
        for (x in a..<a+10){
            for (y in b..<b+10){
                paper[x][y] = 1
            }
        }
    }
    writer.write("${paper.sumOf { row -> row.count { it == 1 } }}")

    writer.flush()
    writer.close()
}