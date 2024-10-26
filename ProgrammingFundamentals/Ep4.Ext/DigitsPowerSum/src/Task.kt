fun getDigitsPowerSum(num: Int): Int {
    return koshish(num)
}

fun koshish(num: Int): Int{
    var ulta = 0
    var ultaKaSquare = 0
    while(num > 0){
        ulta = num % 10
        ultaKaSquare = ultaKaSquare + (ulta * ulta)
    }
    return ultaKaSquare
}

fun main() {
    println(
        getDigitsPowerSum(123)
    )
}