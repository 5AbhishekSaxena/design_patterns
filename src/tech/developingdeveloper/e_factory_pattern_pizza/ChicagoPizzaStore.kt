package tech.developingdeveloper.e_factory_pattern_pizza

import tech.developingdeveloper.e_factory_pattern_pizza.chicago.ChicagoCheesePizza

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return ChicagoCheesePizza()
    }
}