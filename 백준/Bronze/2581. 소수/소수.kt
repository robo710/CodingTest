import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val m = reader.readLine().toInt()
    val n = reader.readLine().toInt()
    val decimal = mutableListOf<Int>()

    for (i in m..n){
        for (j in 2..i){
            if (i == j){
                decimal.add(i)
            } else if(i % j == 0) {
                break
            }
        }
    }
    when(decimal.size){
        0 -> writer.write("-1")
        else -> {
            writer.write("${decimal.sum()}\n")
            writer.write("${decimal[0]}\n")
        }
    }

    writer.flush()
    writer.close()
}