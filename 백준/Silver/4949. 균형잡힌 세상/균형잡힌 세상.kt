import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val line = reader.readLine()
        if (line == ".") break

        val stack = ArrayDeque<Char>()
        var check = true

        for (char in line){
            when(char){
                '(' -> stack.addLast(char)
                '[' -> stack.addLast(char)
                ')' -> {
                    if (stack.isEmpty() || stack.last() != '('){
                        check = false
                        break
                    } else {
                        stack.removeLast()
                    }
                }
                ']' -> {
                    if (stack.isEmpty() || stack.last() != '['){
                        check = false
                        break
                    } else {
                        stack.removeLast()
                    }
                }
            }
        }
        if (check && stack.isEmpty()){
            writer.write("yes\n")
        } else {
            writer.write("no\n")
        }
    }

    writer.flush()
    writer.close()
}