import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val arr1 = Array(n) { Array(m) { 0 } }
    val arr2 = Array(n) { Array(m) { 0 } }
    val answer = Array(n) { Array(m) { 0 } }

    for (i in 0..<n){
        val a = reader.readLine().split(" ").map { it.toInt() }
        for (j in 0..<m){
            arr1[i][j] = a[j]
        }
    }
    for (i in 0..<n){
        val a = reader.readLine().split(" ").map { it.toInt() }
        for (j in 0..<m){
            arr2[i][j] = a[j]
        }
    }
    for (i in 0..<n){
        for (j in 0..<m){
            answer[i][j] =  arr1[i][j] + arr2[i][j]
        }
    }


    for (i in 0..<n){
        for (j in 0..<m){
            writer.write("${answer[i][j]} ")
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
}