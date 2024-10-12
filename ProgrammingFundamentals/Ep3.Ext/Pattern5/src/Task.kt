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
        repeat(lines + 2 * i -4) { j ->
            if ( j == 3 - i - 1 || j == lines - 1 - ((lines / 2 ) - i - 1)  ) {
                print(char2)
            } else {
                print(char1)
            }
        }
        println()
    }

}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P5", ::printPattern)
}