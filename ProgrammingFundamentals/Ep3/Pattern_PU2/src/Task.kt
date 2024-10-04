import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines){i->
        //for initial spaces
        repeat(lines - 1 - i){ print(" ")}

        // for end of line
        repeat(
            if(i == lines - 1 ) (2 * i + 1) else 1
        ){ print(char1) }

        //for -
        repeat(
            if(i == 0 || i == lines - 1) 0 else (2 * i - 1)
        ){print(char2)}

        //*
        repeat(
            if(i ==0 || i == lines - 1) 0 else(1)
        ){ print(char1) }

        println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("PU2", ::printPattern)
}