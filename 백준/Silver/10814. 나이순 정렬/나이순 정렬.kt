import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = mutableListOf<Pair<Int, String>>()
    for (i in 0..<n) {
        val b = (reader.readLine().split(" "))
        a.add(b[0].toInt() to b[1])
    }

    a.sortWith(compareBy({it.first}))

    for ((i, j) in a){
        writer.write("$i $j\n")
    }

    writer.flush()
    writer.close()
}