import com.faangx.ktp.basics.LeapYearCheckerMiniApp

fun isLeapYear(year: Int): Boolean {

    return if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
        true
    }else{
        false
    }
}

fun main() {
    LeapYearCheckerMiniApp(::isLeapYear)
}

//