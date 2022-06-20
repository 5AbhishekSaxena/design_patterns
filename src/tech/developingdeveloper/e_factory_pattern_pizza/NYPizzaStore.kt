package tech.developingdeveloper.e_factory_pattern_pizza

import tech.developingdeveloper.e_factory_pattern_pizza.ny.NYCheesePizza

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return NYCheesePizza()
    }
}