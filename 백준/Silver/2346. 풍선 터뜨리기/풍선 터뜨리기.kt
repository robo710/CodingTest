import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val arr = reader.readLine().split(" ").map { it.toInt() }.toMutableList()
    val numbers = (1..n).toMutableList()

    val answer = mutableListOf<Int>()
    var index = 0

    while (numbers.isNotEmpty()) {
        answer.add(numbers[index])
        val move = arr[index]
        numbers.removeAt(index)
        arr.removeAt(index)

        if (numbers.isEmpty()) break

        index = if (move > 0) {
            (index + (move - 1)) % numbers.size
        } else {
            (index + move % numbers.size + numbers.size) % numbers.size
        }
    }

    writer.write(answer.joinToString(" "))

    writer.flush()
    writer.close()
}