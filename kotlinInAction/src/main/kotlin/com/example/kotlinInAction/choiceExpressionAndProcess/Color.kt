package com.example.kotlinInAction.choiceExpressionAndProcess

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    ;

    fun rgb() = (r * 256 + g) * 256 + b
    fun printColor() = println("$this is ${this.rgb()}")
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
    }

fun measureColor() = Color.ORANGE

fun getWarmthFromSensor(): String {
    return when (val color = measureColor()) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm (red= ${color.r})"
        Color.GREEN -> "warm (green= ${color.g})"
        Color.BLUE -> "warm (blue= ${color.b})"
    }
}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        else -> throw Exception("Dirty color")
    }

fun mixOptimize(c1: Color, c2: Color) =
    when { // 인자 x 의 경우 결과는 boolean 필수
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c2 == Color.RED && c1 == Color.YELLOW) ->
            Color.ORANGE

        else -> throw Exception("Dirty color")
    }

fun main() {
    Color.BLUE.printColor()
    println(Color.BLUE.rgb())

    println(getMnemonic(Color.BLUE))

    println(getWarmthFromSensor())

    println(mix(Color.RED, Color.YELLOW))
//    println(mix(Color.BLUE, Color.BLUE)) // throw exception

    println(mixOptimize(Color.RED, Color.YELLOW))
}