import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val arr = reader.readLine().split(" ").map { it.toInt() }

    val stack = ArrayDeque<Int>()
    var time = 1

    for (num in arr) {
        if (num == time) {
            time++
        } else {
            while (stack.isNotEmpty() && stack.last() == time) {
                stack.removeLast()
                time++
            }
            stack.addLast(num)
        }
    }

    while (stack.isNotEmpty() && stack.last() == time) {
        stack.removeLast()
        time++
    }

    if (time == n + 1) {
        println("Nice")
    } else {
        println("Sad")
    }

    writer.flush()
    writer.close()
}