import kotlin.browser.document
import kotlin.browser.window

import sample.hello

import kotlin.browser.*
import kotlinx.html.*
import kotlinx.html.dom.*

fun main() {
    document.write(hello())
    document.bgColor = "66ccff"
    printHello()
}

fun printHello() {
    window.onload = {
        document.body!!.append.div {
            p {
                +"Here is a link to the "
                a("https://kotlinlang.org") { +"official Kotlin site" }
                +"which is added in code using the kotlinx HTML dsl"
            }
        }
    }
}