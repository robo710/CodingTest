import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine().toLong()
    val b = reader.readLine().toLong()

    when{
        a > 0 && b > 0 -> println(1)
        a < 0 && b > 0 -> println(2)
        a < 0 && b < 0 -> println(3)
        a > 0 && b < 0 -> println(4)
    }
}