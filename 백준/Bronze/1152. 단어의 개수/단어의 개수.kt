import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0L

    val n = reader.readLine().split(" ")
    for (a in n){
        when{
            a.isNotEmpty() -> answer++
        }
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}