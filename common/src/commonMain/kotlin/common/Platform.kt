package common

expect object Platform {
    val name: String
}

fun hello(): String = "Conference Platform for ${Platform.name}"