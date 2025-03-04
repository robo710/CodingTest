import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val a = reader.readLine()!!.split(" ").map { it.toLong() }
    println("${1L - a[0]} ${1L - a[1]} ${2L - a[2]} ${2L - a[3]} ${2L - a[4]} ${8L - a[5]}")
}