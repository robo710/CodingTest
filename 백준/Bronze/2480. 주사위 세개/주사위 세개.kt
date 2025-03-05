import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine().split(" ").map { it.toLong() }
    when{
        a[0] == a[1] && a[0] == a[2] -> println("${10000 + a[0] * 1000}")
        a[0] != a[1] && a[0] == a[2]  -> println("${1000 + a[0] * 100}")
        a[0] == a[1] && a[0] != a[2] -> println("${1000 + a[0] * 100}")
        a[0] != a[1] && a[1] == a[2] -> println("${1000 + a[1] * 100}")
        else -> println(a.max() * 100)
    }
}