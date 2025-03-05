import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine().toInt()
    for (i in 0..<a){
        for (j in 0..<a - i -1){
            print(" ")
        }
        for (j in 0..2*i){
            print("*")
        }
        print(" ")
        println()
    }
}