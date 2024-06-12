import com.faangx.ktp.basics.GradeCalculatorMiniApp

fun gradeFor(m1: Int, m2: Int, m3: Int, m4: Int, m5: Int): String {

    val grade = (m1 + m2 + m3 + m4 + m5 ) / 50f

    return when (grade) {
        in 9f..10f -> "A+"
        in 8f..8.99f -> "A"
        in 7f..7.99f -> "B"
        in 6f..6.99f -> "C"
        in 5f..5.99f -> "D"
        in 3f..4.99f -> "E"
        else -> "Fail"
    }
}

fun main() {
    GradeCalculatorMiniApp(::gradeFor)
}