import com.faangx.ktp.basics.ArmstrongNumbersMiniApp

fun printArmstrongNums(upTo: Int) {
    for ( i in 0 .. upTo){
        if ( isArmstrong(i)){
            print("$i, ")
        }
    }
}

fun isArmstrong(num: Int): Boolean {
    val n = noOfDigits(num)

    var sum = 0
    var x = num
    while(x > 0){
        val digit = x % 10
        x = x / 10
        sum = pow(digit , n) + sum
    }
    return sum == num
}

fun noOfDigits(num: Int): Int {
    var x = num
    var digits = 0
    while (x > 0){
        x = x / 10
        digits = digits + 1
    }
    return  digits
}

fun pow(base: Int, exp: Int): Int {
    var result = 1
    repeat(exp){
        result = result * base
    }
    return  result
}

fun main() {
    ArmstrongNumbersMiniApp(::printArmstrongNums)
}