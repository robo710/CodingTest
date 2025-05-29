import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val listen = mutableSetOf<String>()

    var answer = 0
    val answerList = mutableListOf<String>()

    for (i in 0..<n){
        listen.add(reader.readLine())
    }

    for (i in 0..<m){
        val see = reader.readLine()
        if (listen.contains(see)){
            answer++
            answerList.add(see)
        }
    }

    answerList.sort()

    writer.write("$answer\n")
    answerList.forEach{
        writer.write("$it\n")
    }

    writer.flush()
    writer.close()
}