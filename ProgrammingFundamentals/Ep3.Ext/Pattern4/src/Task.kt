import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) { i ->
        repeat(i + 1) { print(char1) }
        repeat(lines) { print(char2) }
        repeat((lines - i) * 2) { print(char1) }
        repeat(lines) { print(char2) }
        repeat(i + 1) { print(char1) }
        println()
    }
    }

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P4", ::printPattern)
}