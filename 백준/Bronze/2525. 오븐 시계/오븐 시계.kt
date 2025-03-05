import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var (hour, minute) = reader.readLine().split(" ").map { it.toLong() }
    val time = reader.readLine().toLong()

    if (minute + time < 60){
        println("$hour ${minute + time}")
    }
    else if(minute + time >= 60){
        hour += (minute + time) / 60L
        if (hour < 24){
            println("$hour ${(minute + time) % 60L}")
        }
        else{
            println("${hour - 24} ${(minute + time) % 60L}")
        }
    }
}