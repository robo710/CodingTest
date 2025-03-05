import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine().toInt()

    when{
        a % 4 == 0 && a % 100 != 0 || a % 400 == 0 -> println(1)
        else -> println(0)
    }
}