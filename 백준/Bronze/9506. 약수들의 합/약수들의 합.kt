import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val divisor = mutableListOf<Int>()

    do {
        val n = reader.readLine().toInt()

        if (n == -1){
            break
        }

        repeat(n - 1) { i ->
            when (n % (i + 1)) {
                0 -> divisor.add(i + 1)
            }
        }

        when (divisor.sum()) {
            n -> {
                writer.write("$n = ")
                for (i in 0..<divisor.size - 1) {
                    writer.write("${divisor[i]} + ")
                }
                writer.write("${divisor[divisor.size - 1]}\n")
            }

            else -> writer.write("$n is NOT perfect.\n")
        }

        divisor.clear()
    } while (true)


    writer.flush()
    writer.close()
}