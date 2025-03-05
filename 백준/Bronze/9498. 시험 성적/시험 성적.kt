import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine().toInt()

    when{
        a >= 90 -> println("A")
        a >= 80 -> println("B")
        a >= 70 -> println("C")
        a >= 60 -> println("D")
        else -> println("F")
    }
}