import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines){i ->
        repeat(lines){j ->
            print(if ( i == (lines - j ) - 1) char1 else char2)
        }
        println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P2", ::printPattern)
}