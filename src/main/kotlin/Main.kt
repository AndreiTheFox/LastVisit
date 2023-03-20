fun main() {
    val timeFromLastVisit: Int = 85100
    println(agoToText(timeFromLastVisit))
}
fun postfixAddForMinutes (timeQuantityForMinutes: Int) = when {
    (timeQuantityForMinutes == 1)   -> "у"
    ((timeQuantityForMinutes-11)%10==0) -> "у"
    (timeQuantityForMinutes%10 in 2..4) -> "ы"
    else -> ""
}
fun postfixAddForHours (timeQuantityForHours: Int)= when {
    (timeQuantityForHours == 1)   -> ""
    (timeQuantityForHours%10 in 2..4)   -> "а"
    else -> "ов"
}
fun agoToText (timeFromLastVisit: Int) = when {
    (timeFromLastVisit <= 60) -> "только что"
    (timeFromLastVisit in 61..3600) -> {
        val timeToMinutes: Int = timeFromLastVisit/60
        "$timeToMinutes минут${postfixAddForMinutes(timeToMinutes)} назад"}
    (timeFromLastVisit in 3601..86400) -> {
        val timeToHours: Int = timeFromLastVisit/3600
        "$timeToHours час${postfixAddForHours(timeToHours)} назад"
    }
    (timeFromLastVisit in 86401..172800) -> "вчера"
    (timeFromLastVisit in 172801..259200) -> "позавчера"
    else -> "давно"
}

