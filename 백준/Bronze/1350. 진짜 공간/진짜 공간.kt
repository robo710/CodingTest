import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val fileNumber = reader.readLine().toLong()
    val file = reader.readLine()!!.split(" ").map { it.toLong() }
    val cluster = reader.readLine().toLong()
    var answer = 0L

    for (i in 0..<fileNumber){
        if(file[i.toInt()] % cluster == 0L){
            answer += cluster * (file[i.toInt()] / cluster)
        }
        else{
            answer += cluster * ((file[i.toInt()] / cluster) + 1)
        }
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}