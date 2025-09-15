import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections.binarySearch

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val numbers = reader.readLine().split(" ").map { it.toInt()}
    val checknums = numbers.sorted().distinct()
    val answer = IntArray(n){0}

    for (i in numbers){
        val index = binarySearch(checknums, i)
        writer.write("$index ")
    }

    writer.flush()
    writer.close()
}