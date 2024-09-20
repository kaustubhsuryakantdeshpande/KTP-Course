import com.faangx.ktp.basics.OddEvenCheckerMiniApp

fun checkEvenOdd(num: Int): String {
    return if (num % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}

fun main() {
    OddEvenCheckerMiniApp(::checkEvenOdd)
}

//
