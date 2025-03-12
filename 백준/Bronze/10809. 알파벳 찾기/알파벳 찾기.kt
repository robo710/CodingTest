import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val s = reader.readLine().toCharArray()
    val alphabet = Array(26) { -1 }

    for (i in s.indices){
        for (j in 'a'..'z'){
            if(s[i] == j){
                if (alphabet[j.code - 97] == -1) {
                    alphabet[j.code - 97] = i
                    break
                }
                else{
                    break
                }
            }
        }
    }

    for (i in 0..25){
        writer.write("${alphabet[i]} ")
    }

    writer.flush()
    writer.close()
}