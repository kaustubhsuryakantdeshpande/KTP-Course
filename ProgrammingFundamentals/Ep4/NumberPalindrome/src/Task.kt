import com.faangx.ktp.basics.NumberPalindromeCheckerMiniApp

fun reverseNum(num: Long): Long {
    var reverse = 0L
    var x = num

    while ( x > 0){
        val remainder = x % 10
        x /= 10
        reverse = reverse * 10 + remainder
    }
    return  reverse
}

fun isPalindrome(num: Long): Boolean {
    return num == reverseNum(num)
}

fun main() {
    NumberPalindromeCheckerMiniApp(
        ::reverseNum, ::isPalindrome
    )
}