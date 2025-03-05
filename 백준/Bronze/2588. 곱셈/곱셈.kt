import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = reader.readLine().toLong()
    val b= reader.readLine()
    val b2 = b.chunked(1).map { it.toLong() }
    println("${a * b2[2]}")
    println("${a * b2[1]}")
    println("${a * b2[0]}")
    println("${a * b.toLong()}")
}