import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val queue = ArrayDeque<Int>()
    val n = reader.readLine().toInt()
    for (i in 0..<n){
        val m = reader.readLine().split(" ")
        when(m[0]){
            "push" -> queue.add(m[1].toInt())
            "pop" -> if (queue.isEmpty()) {
                writer.write("-1\n")
            } else{
                writer.write("${queue.first()}\n")
                queue.removeAt(0)
            }
            "size" -> writer.write("${queue.size}\n")
            "empty" -> writer.write(if (queue.isEmpty()) "1\n" else "0\n")
            "front" -> writer.write(if (queue.isEmpty()) "-1\n" else "${queue.first()}\n")
            "back" -> writer.write(if (queue.isEmpty()) "-1\n" else "${queue.last()}\n")
        }
    }
    writer.flush()
    writer.close()
}