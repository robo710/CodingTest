import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()
    val a = reader.readLine().split(" ").map { it.toLong() }
    println(a.min() * a.max())
}