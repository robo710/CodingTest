import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val person = Array(15){ IntArray(15) }
    for (i in 0..14){
        person[0][i] = i + 1
        person[i][0] = 1
    }

    for (i in 1..14){
        for (j in 1..14){
            person[i][j] = person[i-1][j] + person[i][j-1]
        }
    }

    val t = reader.readLine().toInt()

    for (i in 0..<t){
        val k = reader.readLine().toInt()
        val n = reader.readLine().toInt()
        writer.write("${person[k][n-1]}\n")
    }

    writer.flush()
    writer.close()
}