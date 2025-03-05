import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (a,b) = reader.readLine()!!.split(" ").map { it.toLong() }

    when{
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}