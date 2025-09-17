import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()
    val list = mutableListOf<String>()

    for (i in 1..n){
        val s = reader.readLine()
        map[s] = i
        list.add(s)
    }

    repeat(m) {
        val answer = reader.readLine()
        try {
            val value = answer.toInt()
            writer.write("${ list[value-1] }\n")
        } catch (e: Exception) {
            writer.write("${map[answer]}\n")
        }
    }

    writer.flush()
    writer.close()
}