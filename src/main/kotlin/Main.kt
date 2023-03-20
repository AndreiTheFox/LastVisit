fun main() {
    val timeFromLastVisit: Int = 3300
    println(agoToText(timeFromLastVisit))
}
fun postfixAddForMinutes (timeQuantityForMinutes: Int) = when {
    (timeQuantityForMinutes == 1)   -> "у"
    ((timeQuantityForMinutes-11)%10==0) -> "у"
    (timeQuantityForMinutes == 2)   -> "ы"
    (timeQuantityForMinutes == 3)   -> "ы"
    (timeQuantityForMinutes == 4)   -> "ы"
    (timeQuantityForMinutes == 22)   -> "ы"
    (timeQuantityForMinutes == 23)   -> "ы"
    (timeQuantityForMinutes == 24)   -> "ы"
    (timeQuantityForMinutes == 32)   -> "ы"
    (timeQuantityForMinutes == 33)   -> "ы"
    (timeQuantityForMinutes == 34)   -> "ы"
    (timeQuantityForMinutes == 42)   -> "ы"
    (timeQuantityForMinutes == 43)   -> "ы"
    (timeQuantityForMinutes == 44)   -> "ы"
    (timeQuantityForMinutes == 52)   -> "ы"
    (timeQuantityForMinutes == 53)   -> "ы"
    (timeQuantityForMinutes == 54)   -> "ы"
    else -> ""
}
fun postfixAddForHours (timeQuantityForHours: Int)= when {
    (timeQuantityForHours == 1)   -> ""
    (timeQuantityForHours == 2)   -> "а"
    (timeQuantityForHours == 3)   -> "а"
    (timeQuantityForHours == 4)   -> "а"
    (timeQuantityForHours == 22)   -> "а"
    (timeQuantityForHours == 23)   -> "а"
    (timeQuantityForHours == 24)   -> "а"
    (timeQuantityForHours == 32)   -> "а"
    (timeQuantityForHours == 33)   -> "а"
    (timeQuantityForHours == 34)   -> "а"
    (timeQuantityForHours == 42)   -> "а"
    (timeQuantityForHours == 43)   -> "а"
    (timeQuantityForHours == 44)   -> "а"
    (timeQuantityForHours == 52)   -> "а"
    (timeQuantityForHours == 53)   -> "а"
    (timeQuantityForHours == 54)   -> "а"
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

