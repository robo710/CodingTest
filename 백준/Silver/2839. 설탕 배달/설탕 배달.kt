import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var n = reader.readLine().toInt()
    var answer = 0

    while (n > 0){
        if (n < 3){
            answer = -1
            break
        }

        if (n == 3){
            answer += 1
            break
        }

        if (n % 5 == 0){
            answer += n/5
            break
        }

        if (n % 3 != 0 && n > 5){
            answer += 1
            n -= 5
        } else if (n % 3 == 0){
            answer += 1
            n -= 3
        } else{
            answer = -1
            break
        }
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}