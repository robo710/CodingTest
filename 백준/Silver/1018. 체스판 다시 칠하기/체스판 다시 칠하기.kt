import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = Int.MAX_VALUE
    val (n, m) = reader.readLine().split(" ").map {it.toInt()}

    val board = Array(n) { CharArray(m) }
    for (i in 0..<n) {
        val a = reader.readLine()
        for (j in 0..<m) {
            board[i][j] = a[j]
        }
    }

    for (startRow in 0..n-8) {
        for (startCol in 0..m-8) {
            val chess = Array(8) { CharArray(8) }
            for (i in 0..<8) {
                for (j in 0..<8) {
                    chess[i][j] = board[startRow + i][startCol + j]
                }
            }
            val min = check(chess)
            if (min < answer){
                answer = min
            }
        }
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}

fun check(chess: Array<CharArray>): Int {
    var w = 0
    var b = 0

    for (i in 0..<8) {
        for (j in 0..<8) {
            val startW = if ((i + j) % 2 == 0) 'W' else 'B'
            val startB = if ((i + j) % 2 == 0) 'B' else 'W'

            if (chess[i][j] != startW) w++
            if (chess[i][j] != startB) b++
        }
    }

    return minOf(w, b)
}