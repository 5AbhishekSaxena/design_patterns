package tech.developingdeveloper.k_proxy_pattern

class LazyBookParser : BookParser {
    private val bookParser: ExpensiveBookParser by lazy { ExpensiveBookParser() }

    init {
        println("LazyBookParser initialized.")
    }

    override val numberOfPages: Int
        get() {
            println("LazyBookParser, numberOfPages called.")
            return bookParser.numberOfPages
        }

}
