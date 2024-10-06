import com.faangx.ktp.basics.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
    val a = 'a'
    val b = 'b'
    val terms = mutableListOf<String>()

    for (k in 0..n) {
        val coefficient = combinationsOf(n.toLong(), k.toLong())
        val term = when {
            k == 0 -> "$a^$n"
            k == n -> "$b^$n"
            else -> "${coefficient}${a}^${n - k}${b}^$k"
        }
        terms.add(term)
    }

    val expansion = terms.joinToString(" + ")
    println("($a + $b)^$n = $expansion")
}

fun factorialOf(x: Long): Long {
    return if (x == 0L) 1L else x * factorialOf(x-1)
}

fun permutationsOf(n: Long, r: Long): Long {
    return factorialOf(n) / factorialOf(n -r)
}

fun combinationsOf(n: Long, r: Long): Long {
    return factorialOf(n) / (factorialOf(r) * factorialOf(n - r))
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}