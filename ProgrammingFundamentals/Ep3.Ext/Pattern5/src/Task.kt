import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
        // Upper part of the pattern
        repeat(lines / 2) { i ->
            repeat(lines) { j ->
                if (j == lines / 2) {
                    print(char1)
                } else if (j == i || j == lines - 1 - i) {
                    print(char2)
                } else {
                    print(" ")
                }
            }
            println()
        }

        // Middle part of the pattern
        repeat(lines) { print(char1) }
        println()

    // Lower part of the pattern
    repeat(lines / 2) { i ->
        repeat(lines / 2 - i - 1) { print(" ") }
        repeat(2 * i + 3) { j ->
            when (j){
                0, 2 * i + 2 -> print(char2)
                i + 1 -> print(char1)
                else -> print(' ')
            }
        }
        println()
    }

}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P5", ::printPattern)
}