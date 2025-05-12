import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val divisor = mutableListOf<Int>()

    val (n, k) = reader.readLine().split(" ").map { it.toInt() }

    repeat(n){ i ->
        when(n % (i + 1)){
            0 -> divisor.add(i + 1)
        }
    }
    if (k <= divisor.size){
        writer.write("${divisor[k - 1]}")
    } else {
        writer.write("0")
    }

    writer.flush()
    writer.close()
}