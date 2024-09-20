import com.faangx.ktp.basics.MaxOfTwoNumsMiniApp

fun maxOf(x: Int, y: Int): Int {
    return when {
        (x > y) -> x
        else -> {y}
    }
}

fun main() {
    MaxOfTwoNumsMiniApp(::maxOf)
}

//