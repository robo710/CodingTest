import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()
    val a = Array<String>(n) {""}
    var answer = ""
    var buffer = ""
    for (i in 0..<n){
        a[i] = reader.readLine()
    }
    answer = a[0]
    for (i in 0..<n-1){
        if (answer == a[i+1]){
            buffer = a[i]
        }
        else{
            val splitA = answer.chunked(1)
            val splitB = a[i+1].chunked(1)
            for (j in 0..<a[i].length){
                if (splitA[j] == splitB[j]){
                    buffer += splitA[j]
                }
                else{
                    buffer += "?"
                }
            }
        }
        answer = buffer
        buffer = ""
    }
    println(answer)
}