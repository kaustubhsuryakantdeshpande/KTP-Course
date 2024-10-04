import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) { i ->
        repeat(2 * lines - 1) { j ->
            print(
                if (j == lines - 1 - i || j == lines - 1 + i) char1 else char2
            )
        }
        println()
    }
}
fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P3", ::printPattern)
}