import com.faangx.ktp.basics.LcmHcfCalculatorMiniApp

fun getLCM(x: Int, y: Int): Int { // common division approach
    val a = if (x > y ) x else y
    val b = if ( x < y ) x else y

    var multiple = a
    while (multiple % b != 0){
        multiple = multiple + a
    }

    return multiple
}

fun getHCF(x: Int, y: Int): Int { //long division
    var a = x
    var b = y

    while ( b != 0){
        val remainder = a % b
        a = b
        b = remainder
    }
    return  a //since remainder has to come out zero in end we return a only
}

fun main() {
    LcmHcfCalculatorMiniApp(
        ::getLCM,
        ::getHCF
    )
}

/* Comments : There is some issue when using debugger on
inserting values in mini app
 */

/*
alias for LCM
LCM = a * b / HCF
 */