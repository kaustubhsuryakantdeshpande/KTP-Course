import com.faangx.ktp.basics.StringCaseConvertorMiniApp

fun convertToSentenceCase(text: String): String {
    var capitlize = true // since every new sentence starts with capital
    var requireSpace = false

    return buildString {
        for (char in text){
            if (requireSpace){
                if (char != ' ') append(' ')
                requireSpace = false
            }
            if (isAlphabet(char) && capitlize){
                append(convertToUppercase(char))
                capitlize = false
            } else {
                append(char)
            }
            if (char in listOf('.', '!', '?')){
                capitlize = true
                requireSpace = true
            }
        }
    }
}

fun isAlphabet(char: Char): Boolean {
    return char in 'a'..'z' || char in 'A'..'Z'

}

fun convertToTitleCase(text: String): String {
    var capitalize = true

    return buildString {
        for (char in text){
            if (char != ' '){ //ignore space
                if (capitalize){ // capitalize if needed
                    append(convertToUppercase(char))
                    capitalize = false
                } else{
                    append(char)
                }
            }
            if (char in listOf('.', '!', '?', ':', ';', '-', ' ', ',' ))
                capitalize = true
        }
    }
}

fun convertToUppercase(text: String): String {
    return buildString {
        for (char in text) {
            append(convertToUppercase(char))
        }
    }
}

fun convertToLowercase(text: String): String {
    return buildString {
        for (char in text){
            append(convertToLowercase(char))
        }
    }
}

fun convertToSnakeCase(text: String): String {
    return buildString {
        for (char in text ){
            if (char == ' '){
                append('_')
            } else {
                append(char)
            }
        }
    }
}

fun convertToUppercase(char: Char): Char {
    return when(char){
        in 'a'..'z' -> char.uppercaseChar()
        else -> char
    }
}
// Yeh convert to lower and upper dono ko alag naming dena chahiye tha confusioni create kar raha hai especially shuru shuru me toh char me dhyan hi ni jata
fun convertToLowercase(char: Char): Char {
    return when(char){
        in 'A'..'Z' -> char.lowercaseChar()
        else -> char
    }
}

fun main() {
    StringCaseConvertorMiniApp(
        ::convertToSentenceCase,
        ::convertToTitleCase,
        ::convertToUppercase,
        ::convertToLowercase,
        ::convertToSnakeCase
    )
}