import kotlin.math.roundToInt

fun main() {
}

fun checkString(arrayOfStringsToCheck: Array<String?>) =
    if(arrayOfStringsToCheck.filter {it -> it == "a" || it == "b"}.size == arrayOfStringsToCheck.size)
        (((100.0 / arrayOfStringsToCheck.size) * arrayOfStringsToCheck.filter { it -> it == "a" }.size) * 10.0).roundToInt() / 10.0
    else -1.0