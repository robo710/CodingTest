import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine()!!.split(" ").map { it.toLong() }
    println(a[0] + a[1])
}
