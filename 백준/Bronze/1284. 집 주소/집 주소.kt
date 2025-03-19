import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 1

    while (true){
        val n = reader.readLine()
        if (n == "0"){
            break
        } else{
            val a = n.chunked(1)
            for (i in a){
                when(i){
                    "1" -> answer += 2
                    "0" -> answer += 4
                    else -> answer += 3
                }
                answer += 1
            }
            writer.write("$answer\n")
        }
        answer = 1
    }

    writer.flush()
    writer.close()
}