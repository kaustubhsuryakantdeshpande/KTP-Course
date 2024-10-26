import com.faangx.ktp.basics.StringPalindromeCheckerMiniApp

fun reverseStr(str: String): String {
    // Inefficient because on concatenation a new string is produced every time
    /*var rev = ""
     for ( i in str.lastIndex downTo 0){
         rev += str[i]
     }
    return rev */
    //More efficient approach in kotlin
    return  buildString {
        for(i in str.length-1 downTo 0){
            append(str[i])
        }
    }
}

fun isPalindrome(str: String, ignoreCase: Boolean): Boolean {
    if(str == "") return false
    return areStringsEqual(str, reverseStr(str) , ignoreCase)
}

fun areStringsEqual(s1: String, s2: String, ignoreCase: Boolean): Boolean {
    if ( s1.length != s2.length) return false // in such cases else condition is not required

    for ( i in s1.indices){
        if (!areCharsEqual(s1[i], s2[i], ignoreCase)) return false
    }
    return true
}

fun areCharsEqual(c1: Char, c2: Char, ignoreCase: Boolean): Boolean {
    // if we go by comparing every alphabet approach it will get too long and so we use unicode and more specifically ASCII code to compare the characters
    if(!ignoreCase) return c1 == c2
    //return convertToLowercase(c1) == convertToLowercase(c2)
    return convertToUppercase(c1) == convertToUppercase(c2)
}

fun convertToLowercase(char: Char): Char {
    //add 32 to make uppercase to lowercase
    return if (char in 'A'..'Z'){
        Char(char.code + 32)
    } else{
        char
    }
}

fun convertToUppercase(char : Char): Char {
    return if (char in 'a' .. 'z'){
        Char(char.code - 32)
    } else{
        char
    }
}

fun main() {
    StringPalindromeCheckerMiniApp(
        ::reverseStr,
        ::isPalindrome
    )
}