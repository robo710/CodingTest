import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0L
    for(i in 0..7){
        val a = reader.readLine()
        val b = a.chunked(1)
        for(j in 0..7) {
            when {
                i % 2 == 0 && j % 2 == 0 && b[j] == "F" -> answer++
                i % 2 != 0 && j % 2 != 0 && b[j] == "F" -> answer++
            }
        }
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}