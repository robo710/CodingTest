import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val card = ArrayDeque<Int>()
    val n = reader.readLine().toInt()
    for (i in 0..<n){
        card.add(i + 1)
    }
    while(card.size != 1){
        card.removeFirst()
        card.addLast(card.removeFirst())
    }
    writer.write("${card[0]}")
    writer.flush()
    writer.close()
}