import com.faangx.ktp.basics.MaxOfThreeNumsMiniApp

fun maxOf(x: Int, y: Int, z: Int): Int {
    return when {
        (z > y && z > x) -> z
        (y > x && y > z) -> y
        else -> x
    }
}

fun main() {
    MaxOfThreeNumsMiniApp(::maxOf)
}

//