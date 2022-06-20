package tech.developingdeveloper.e_factory_pattern_pizza.chicago

import tech.developingdeveloper.e_factory_pattern_pizza.Pizza
import tech.developingdeveloper.e_factory_pattern_pizza.PizzaStore
import tech.developingdeveloper.e_factory_pattern_pizza.CheesePizza
import tech.developingdeveloper.e_factory_pattern_pizza.ClamPizza

class ChicagoPizzaStore : PizzaStore() {

    private val pizzaIngredientFactory = ChicagoPizzaIngredientFactory()
    override fun createPizza(type: String): Pizza {
        return when (type.lowercase()) {
            "cheese" -> CheesePizza(pizzaIngredientFactory).apply { name = "Chicago Style Cheese Pizza" }
            "clam" -> ClamPizza(pizzaIngredientFactory).apply { name = "Chicago Style Clam Pizza" }
            else -> throw IllegalArgumentException()
        }
    }
}