import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()

    writer.write("${Fibo(n)}")

    writer.flush()
    writer.close()
}

fun Fibo(n:Int) :Int {
    var answer = 0
    var temp = 0
    var a = 1
    for (i in 0..<n){
        temp = answer
        answer += a
        a = temp
    }

    return answer
}