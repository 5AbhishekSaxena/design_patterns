package tech.developingdeveloper.k_proxy_pattern


fun main() {
    println("main called.")
    val bookParser = LazyBookParser()
    println("Some random operations executed.")
    println("main, numberOfPages: ${bookParser.numberOfPages}")
}
