import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val basket = mutableListOf<Int>()
    for (i in 1..30){
        basket.add(i)
    }

    for(i in 1..28){
        val n = reader.readLine().toInt()
        basket[n-1] = 0
    }
    basket.forEach {
        if (it != 0) {
            writer.write("$it\n")
        }
    }
    writer.flush()
    writer.close()
}