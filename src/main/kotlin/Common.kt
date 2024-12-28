

fun sign(v: Int): Int {
    return if (v > 0) 1 else if (v < 0) -1 else 0
}

fun expect(header: String, v: Int, e: Int) {
    print(header)
    print(": $v")
    if (v == e)
        println(" - OK")
    else
        println(" <> $e - FAIL")
}