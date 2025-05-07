import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(9){Array(9){0} }

    for (i in 0..<9){
        val a = reader.readLine().split(" ").map { it.toInt() }
        for (j in 0..<9){
            arr[i][j] = a[j]
        }
    }

    var answer = arr[0][0]
    val answerArr = Array(2){0}

    for (i in 0..<9){
        for (j in 0..<9){
            if (answer < arr[i][j]){
                answer = arr[i][j]
                answerArr[0] = i
                answerArr[1] = j
            }
        }
    }

    writer.write("$answer\n")
    writer.write("${answerArr[0] + 1} ${answerArr[1] + 1}")

    writer.flush()
    writer.close()
}