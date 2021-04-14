package tech.developingdeveloper.kotlin.a_strategy_patern.quack

class NoQuack : IQuack {
    override fun quack() {
        println("NoQuack")
    }
}