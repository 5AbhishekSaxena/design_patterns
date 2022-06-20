package tech.developingdeveloper.e_factory_pattern_pizza

import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Cheese
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Clam
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Dough
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Pepperoni
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Sauce


interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createPepperoni(): Pepperoni
    fun createClam(): Clam
}