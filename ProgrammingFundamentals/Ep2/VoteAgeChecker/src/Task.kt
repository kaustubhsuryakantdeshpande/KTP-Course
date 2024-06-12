import com.faangx.ktp.basics.VoteAgeCheckerMiniApp

fun canVote(age: Int): Boolean {
    return age >= 18
}

fun main() {
    VoteAgeCheckerMiniApp(::canVote)
}