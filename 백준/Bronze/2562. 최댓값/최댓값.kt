import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<Long>()
    var max = 0L
    var maxIndex = 0L

    for (i in 0..8){
        val a = reader.readLine().toLong()
        list.add(a)
    }
    for (i in 0..8){
        if (list[i] > max){
            max = list[i]
            maxIndex = i + 1L
        }
    }
    writer.write("$max\n")
    writer.write("$maxIndex")

    writer.flush()
    writer.close()
}