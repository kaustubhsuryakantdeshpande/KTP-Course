import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) { i ->
        repeat(lines) { j ->
            print(
                if (j == i) char1 else char2
            )
        }
        println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P1", ::printPattern)
}