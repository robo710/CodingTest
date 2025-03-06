import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0L

    val n = reader.readLine().toLong()
    var b = n
    var a = 0L

    while (n != a){
        a = b/10 + b % 10
        a = b % 10 * 10 + a % 10
        b = a
        answer++
    }
    when{
        n == 0L -> writer.write("1")
        else -> writer.write("$answer")
    }

    writer.flush()
    writer.close()
}