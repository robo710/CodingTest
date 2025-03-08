import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toLong()

    val x = mutableListOf<Char>()
    val y = mutableListOf<Char>()
    val answer = mutableListOf<Char>()

    for (i in 0..<n){
        val a = reader.readLine().first()
        x.add(a)
    }
    x.sort()
    for (i in x){
        when{
            i !in y -> y.add(i)
        }
    }
    for (i in y){
        when{
            x.count { it == i } >= 5 -> answer.add(i)
        }
    }
    when{
        answer.isEmpty() -> writer.write("PREDAJA")
        else -> writer.write((answer.joinToString("")))
    }

    writer.flush()
    writer.close()
}