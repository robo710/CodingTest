import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val stack = mutableListOf<Long>()
    val n = reader.readLine().toLong()
    for (i in 0..<n){
        val a = reader.readLine().split(" ").map { it.toLong() }
        when{
            a[0] == 1L -> stack.add(a[1])
            a[0] == 2L -> if (stack.isEmpty()) {
                writer.write("-1\n")
            } else{
                writer.write("${stack.last()}\n")
                stack.removeAt(stack.lastIndex)
            }
            a[0] == 3L -> writer.write("${stack.size}\n")
            a[0] == 4L -> writer.write(if (stack.isEmpty()) "1\n" else "0\n")
            a[0] == 5L -> writer.write(if (stack.isEmpty()) "-1\n" else "${stack.last()}\n")
        }
    }

    writer.flush()
    writer.close()
}