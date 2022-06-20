package tech.developingdeveloper.e_factory_pattern_pizza.ny

import tech.developingdeveloper.e_factory_pattern_pizza.CheesePizza
import tech.developingdeveloper.e_factory_pattern_pizza.ClamPizza
import tech.developingdeveloper.e_factory_pattern_pizza.Pizza
import tech.developingdeveloper.e_factory_pattern_pizza.PizzaStore

class NYPizzaStore : PizzaStore() {
    private val pizzaIngredientFactory = NYPizzaIngredientFactory()
    override fun createPizza(type: String): Pizza {
        return when (type.lowercase()) {
            "cheese" -> CheesePizza(pizzaIngredientFactory).apply { name = "NY Style Cheese Pizza" }
            "clam" -> ClamPizza(pizzaIngredientFactory).apply { name = "NY Style Clam Pizza" }
            else -> throw IllegalArgumentException()
        }
    }
}