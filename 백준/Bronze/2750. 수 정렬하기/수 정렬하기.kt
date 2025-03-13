import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = Array<Int>(n){ 0 }
    for (i in 0..<n){
        a[i] = reader.readLine().toInt()
    }
    a.sort()
    for (i in 0..<n) {
        writer.write("${a[i]}\n")
    }

    writer.flush()
    writer.close()
}