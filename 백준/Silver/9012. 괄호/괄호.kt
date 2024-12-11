import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = Array(n) { reader.readLine() }
    var check:Int

    for (i in 0..< n){
        check = 0
        for (char in a[i]){
            if (char == '('){
                check++
            } else{
                check--
            }
            if (check < 0){
                break
            }
        }
        if (check == 0){
            println("YES")
        }
        else{
            println("NO")
        }
    }

    writer.flush()
    writer.close()
}