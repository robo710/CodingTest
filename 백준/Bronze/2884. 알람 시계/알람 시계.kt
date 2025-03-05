import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (a, b) = reader.readLine().split(" ").map { it.toLong() }

    if (b - 45 < 0 && a - 1 < 0){
        println("23 ${b + 15}")
    }
    else if (b - 45 < 0){
        println("${a - 1} ${b + 15}")
    }
    else{
        println("$a ${b - 45}")
    }
}