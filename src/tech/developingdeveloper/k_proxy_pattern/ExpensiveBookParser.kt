package tech.developingdeveloper.k_proxy_pattern

class ExpensiveBookParser : BookParser {
    override val numberOfPages: Int
        get() {
            println("ExpensiveBookParser, numberOfPages called.")
            return 1
        }

    init {
        // some expensive
        println("ExpensiveBookParser initialized.")
    }

}
