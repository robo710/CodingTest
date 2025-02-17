import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine()!!.toInt()
    if (n == 0) print(0)
    else if (n == 1) print(1)
    else{
        var first = 0L
        var second = 1L
        var finish = 0L

        for (i in 2..n){
            finish = first + second
            first = second
            second = finish
        }

        print(finish)
    }
}