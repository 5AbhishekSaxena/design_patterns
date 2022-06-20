package tech.developingdeveloper.e_factory_pattern_pizza

import tech.developingdeveloper.e_factory_pattern_pizza.chicago.ChicagoPizzaStore
import tech.developingdeveloper.e_factory_pattern_pizza.ny.NYPizzaStore


fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza.name}")

    println()

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza.name}")
}