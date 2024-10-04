import com.faangx.ktp.basics.MultiplicationTableV1MiniApp

fun printTable(num: Int, start: Int, end: Int) {
    for (i in start .. end ) {
        println("$num x $i = ${num * i }")
    }
}

fun main() {
    MultiplicationTableV1MiniApp(::printTable)
}