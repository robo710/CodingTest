import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, c) = reader.readLine().split(" ").map { it.toLong() }
    println("${a + b + c}")
}