import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val stack = mutableListOf<Int>()
    val n = reader.readLine().toLong()
    for (i in 0..<n){
        val a = reader.readLine().split(" ").map { it }
        when{
            a[0] == "push" -> stack.add(a[1].toInt())
            a[0] == "pop" -> if (stack.isEmpty()) {
                println("-1")
            } else{
                println(stack.last())
                stack.removeAt(stack.lastIndex)
            }
            a[0] == "size" -> println(stack.size)
            a[0] == "empty" -> println(if (stack.isEmpty()) "1" else "0")
            a[0] == "top" -> println(if (stack.isEmpty()) "-1" else stack.last())
        }
    }
}