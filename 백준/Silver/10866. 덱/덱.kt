import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val deque = mutableListOf<Int>()
    val n = reader.readLine().toInt()
    for (i in 0..<n){
        val m = reader.readLine().split(" ")
        when(m[0]){
            "push_front" -> deque.add(0, m[1].toInt())
            "push_back" -> deque.add(deque.size, m[1].toInt())
            "pop_front" -> if (deque.isEmpty()) {
                println("-1")
            } else{
                println("${deque.first()}")
                deque.removeAt(0)
            }
            "pop_back" -> if (deque.isEmpty()) {
                println("-1")
            } else{
                println("${deque.last()}")
                deque.removeAt(deque.lastIndex)
            }
            "size" -> println(deque.size)
            "empty" -> println(if (deque.isEmpty()) "1" else "0")
            "front" -> println(if (deque.isEmpty()) "-1" else "${deque.first()}")
            "back" -> println(if (deque.isEmpty()) "-1" else "${deque.last()}")
        }
    }
}