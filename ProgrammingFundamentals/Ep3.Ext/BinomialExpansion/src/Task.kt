import com.faangx.ktp.basics.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
    val terms = mutableListOf<String>()
    for (k in 0..n) {
        val coefficient = combinationsOf(n.toLong(), k.toLong())
        val aTerm = if (n - k > 0) "a^${n - k}" else ""
        val bTerm = if (k > 0) "b^$k" else ""
        val coeffStr = if (coefficient > 1) "$coefficient" else ""
        val term = coeffStr + aTerm + (if (aTerm.isNotEmpty() && bTerm.isNotEmpty()) "*" else "") + bTerm
        terms.add(term)
    }
    println("(a + b)^$n = " + terms.joinToString(" + "))
}

fun factorialOf(x: Long): Long {
    if (x == 0L || x == 1L) return 1
    var result = 1L
    for (i in 2..x) {
        result *= i
    }
    return result

}

fun permutationsOf(n: Long, r: Long): Long {
    return factorialOf(n) / factorialOf(n - r)
}

fun combinationsOf(n: Long, r: Long): Long {
    return factorialOf(n) / (factorialOf(r) * factorialOf(n - r))
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}