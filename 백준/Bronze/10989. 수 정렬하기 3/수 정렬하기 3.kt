import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = IntArray(10001)

    repeat(n){
        val m = reader.readLine().toInt()
        a[m]++
    }

    for (i in 1..10000){
        repeat(a[i]){
            writer.write("$i\n")
        }
    }

    writer.flush()
    writer.close()
}