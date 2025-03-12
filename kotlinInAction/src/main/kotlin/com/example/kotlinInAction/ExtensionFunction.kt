package strings

fun String.lastChar(): Char = this.get(this.length - 2)

val String.lastChar: Char get() = get(length - 1)

fun StringBuilder.lastChar(): Char = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        setCharAt(length - 1, value)
    }