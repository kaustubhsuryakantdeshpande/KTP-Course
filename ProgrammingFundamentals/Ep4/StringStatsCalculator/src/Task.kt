import com.faangx.ktp.basics.StringStatsCalculatorMiniApp

fun calcNoOfChars(text: String): Int {
    return text.length
}

fun calcNoOfAlphabets(text: String): Int {
    var count = 0
    for (i in text){
        if ( i in 'A'..'Z' ||i in 'a'.. 'z'){
            count = count + 1
        }
    }
    return count
}

fun calcNoOfVowels(text: String): Int { //good way to teach lists
    var count = 0
    for ( c in text){
        if (c in listOf('a','e','i','o','u','A','E','I','O','U'))
            count = count + 1
    }
    return count
}

fun isAlphabet(c: Char): Boolean {
    return c in 'a'..'z' || c in 'A'..'Z'
}

fun calcNoOfConsonants(text: String): Int {
    /*
    var count = 0
    for ( c in text){
        if (isAlphabet(c) c !in listOf('a','e','i','o','u','A','E','I','O','U'))
            count = count + 1
    }
    return count
     */
    return calcNoOfAlphabets(text) - calcNoOfVowels(text)
}

fun calcNoOfDigits(text: String): Int {
    var count = 0
    for ( c in text){
        if (c in '0'..'9')
            count = count + 1
    }
    return count
}

fun calcNoOfSpecialChars(text: String): Int {
    // since creating a list of all special characters will be tedious so,
    return text.length - (calcNoOfAlphabets(text) + calcNoOfSpaces(text) + calcNoOfDigits(text))
}

fun calcNoOfSpaces(text: String): Int {
    var count = 0
    for ( c in text){
        if (c in listOf(' ', '\n', '\t'))
            count = count + 1
    }
    return count
}

fun calcNoOfWords(text: String): Int {
    var count = 0
    var nonPunctuationCharFound = false
    for ( c in text){
        if (c !in listOf(' ', '\t', '\n', '.', ',', '?', '!')){
            nonPunctuationCharFound =true
        } else if (nonPunctuationCharFound){
            nonPunctuationCharFound = false
            count = count + 1
        }
    }
    if (nonPunctuationCharFound) count = count + 1

    return count
}

fun calcNoOfSentences(text: String): Int {
    var count = 0
    var nonPunctuationCharFound = false
    for ( c in text){
        if (c !in listOf(' ', '\t', '\n', '.', ',', '?', '!')){
            nonPunctuationCharFound =true
        } else if (c in listOf('.', '!', '?') && nonPunctuationCharFound){
            nonPunctuationCharFound = false
            count = count + 1
        }
    }
    if (nonPunctuationCharFound) count = count + 1

    return count
}

fun main() {
    StringStatsCalculatorMiniApp(
        ::calcNoOfChars,
        ::calcNoOfAlphabets,
        ::calcNoOfVowels,
        ::calcNoOfConsonants,
        ::calcNoOfDigits,
        ::calcNoOfSpecialChars,
        ::calcNoOfSpaces,
        ::calcNoOfWords,
        ::calcNoOfSentences
    )
}