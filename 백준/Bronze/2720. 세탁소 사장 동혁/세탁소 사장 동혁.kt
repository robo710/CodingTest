import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    for(i in 1..n){
        var cent = reader.readLine().toInt()
        val quarter = cent / 25
        cent %= 25
        val dime = cent / 10
        cent %= 10
        val nickel = cent / 5
        cent %= 5
        writer.write("$quarter $dime $nickel $cent\n")
    }

    writer.flush()
    writer.close()
}