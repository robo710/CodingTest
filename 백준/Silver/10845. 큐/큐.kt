import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val queue = mutableListOf<Int>()
    val n = reader.readLine().toInt()
    for (i in 0..<n){
        val m = reader.readLine().split(" ")
        when(m[0]){
            "push" -> queue.add(m[1].toInt())
            "pop" -> if (queue.isEmpty()) {
                println("-1")
            } else{
                println("${queue.first()}")
                queue.removeAt(0)
            }
            "size" -> println(queue.size)
            "empty" -> println(if (queue.isEmpty()) "1" else "0")
            "front" -> println(if (queue.isEmpty()) "-1" else "${queue.first()}")
            "back" -> println(if (queue.isEmpty()) "-1" else "${queue.last()}")
        }
    }
}