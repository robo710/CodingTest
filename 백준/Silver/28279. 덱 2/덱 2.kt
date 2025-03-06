import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val deque = ArrayDeque<Int>()
    val n = reader.readLine().toInt()
    for (i in 0..<n){
        val m = reader.readLine().split(" ").map { it.toInt() }
        when(m[0]){
            1 -> deque.addFirst(m[1])
            2 -> deque.addLast(m[1])
            3 -> if (deque.isEmpty()) {
                writer.write("-1\n")
            } else{
                writer.write("${deque.first()}\n")
                deque.removeAt(0)
            }
            4 -> if (deque.isEmpty()) {
                writer.write("-1\n")
            } else{
                writer.write("${deque.last()}\n")
                deque.removeLast()
            }
            5 -> writer.write("${deque.size}\n")
            6 -> writer.write(if (deque.isEmpty()) "1\n" else "0\n")
            7 -> writer.write(if (deque.isEmpty()) "-1\n" else "${deque.first()}\n")
            8 -> writer.write(if (deque.isEmpty()) "-1\n" else "${deque.last()}\n")
        }
    }
    writer.flush()
    writer.close()
}