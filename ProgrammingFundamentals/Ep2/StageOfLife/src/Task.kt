import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    return when(age) {
        in 0..2 -> "Infancy"
        in 3..11 -> "Childhood"
        in 12..17 -> "Teenage"
        in 18..59 -> "Adulthood"
        else -> "Old age"
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}