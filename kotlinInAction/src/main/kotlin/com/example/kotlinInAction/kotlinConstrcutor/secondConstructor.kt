package com.example.kotlinInAction.kotlinConstrcutor

import java.net.URL

open class Downloader {
    constructor(url: String?) {
        println("url String param constructor: $url")
    }

    constructor(url: URL?) {
        println("url param constructor: $url")
    }
}

class MyDownloader : Downloader {
    constructor(url: String?) : this(URL(url))
    constructor(url: URL?) : super(url)
}

fun main() {
    val downloader = Downloader("String url")
    val myDownloader = MyDownloader("String url")
}