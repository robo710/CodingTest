import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val word = mutableListOf<String>()

    repeat(n){
        val t = reader.readLine()

        if(!word.contains(t)){
            word.add(t)
        }
    }

    word.sort()
    word.sortBy { it.length }

    for (i in 0..<word.size){
        writer.write("${word[i]}\n")
    }

    writer.flush()
    writer.close()
}