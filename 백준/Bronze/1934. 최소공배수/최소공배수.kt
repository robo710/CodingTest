import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = reader.readLine().toInt()

    repeat(n){
        val (a, b) = reader.readLine().split(" ").map { it.toInt() }
        gcd(a, b)
        writer.write("${(a * b) / gcd(a, b)}\n")
    }

    writer.flush()
    writer.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a%b) else a