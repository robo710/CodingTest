import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))


    val a = reader.readLine().toInt()
    val b = reader.readLine().toInt()
    val c = reader.readLine().toInt()
    val d = reader.readLine().toInt()
    val e = reader.readLine().toInt()

    val nums = listOf(a, b, c, d, e)
    val average = nums.sum() / 5
    val middle = nums.sorted()[2]

    writer.write("$average\n$middle")

    writer.flush()
    writer.close()
}