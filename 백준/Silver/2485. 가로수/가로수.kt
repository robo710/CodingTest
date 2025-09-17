import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val tree = mutableListOf<Int>()
    val interval = mutableListOf<Int>()

    repeat(n){
        tree.add(reader.readLine().toInt())
    }

    repeat(n - 1){
        interval.add(tree[it + 1] - tree[it])
    }

    val gcd = interval.reduce { acc, i -> gcd(acc.toLong(), i.toLong()).toInt() }
    val answer = interval.map { it / gcd - 1 }.sum()

    writer.write("${answer}")

    writer.flush()
    writer.close()
}

fun gcd(a: Long, b: Long): Long = if (b != 0L) gcd(b, a % b) else a