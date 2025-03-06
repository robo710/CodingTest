import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = ""

    val a = reader.readLine()
    val b = reader.readLine()
    val c = reader.readLine()

    when(a){
        "brown" -> answer += "1"
        "red" -> answer += "2"
        "orange" -> answer += "3"
        "yellow" -> answer += "4"
        "green" -> answer += "5"
        "blue" -> answer += "6"
        "violet" -> answer += "7"
        "grey" -> answer += "8"
        "white" -> answer += "9"
    }
    when(b){
        "black" -> answer += "0"
        "brown" -> answer += "1"
        "red" -> answer += "2"
        "orange" -> answer += "3"
        "yellow" -> answer += "4"
        "green" -> answer += "5"
        "blue" -> answer += "6"
        "violet" -> answer += "7"
        "grey" -> answer += "8"
        "white" -> answer += "9"
    }
    when(c){
        "black" -> writer.write(answer)
        "brown" -> writer.write("${answer.toLong() * 10}")
        "red" -> writer.write("${answer.toLong() * 100}")
        "orange" -> writer.write("${answer.toLong() * 1000}")
        "yellow" -> writer.write("${answer.toLong() * 10000}")
        "green" -> writer.write("${answer.toLong() * 100000}")
        "blue" -> writer.write("${answer.toLong() * 1000000}")
        "violet" -> writer.write("${answer.toLong() * 10000000}")
        "grey" -> writer.write("${answer.toLong() * 100000000}")
        "white" -> writer.write("${answer.toLong() * 1000000000}")
    }

    writer.flush()
    writer.close()
}