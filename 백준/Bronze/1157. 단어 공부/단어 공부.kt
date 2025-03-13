import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = reader.readLine().toUpperCase()
    val b = Array<Int>(26) { 0 }
    var answer:Char = '?'
    var max = 0
    for (i in a){
        b[i.toInt() - 65] += 1
    }

    for (i in 0..25){
        if (max == b[i]){
            answer = '?'
        } else if(max < b[i]){
            max = b[i]
            answer = (i + 65).toChar()
        }
    }
    writer.write("$answer")

    writer.flush()
    writer.close()
}