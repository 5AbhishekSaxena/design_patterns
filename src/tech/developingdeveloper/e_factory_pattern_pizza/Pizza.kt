package tech.developingdeveloper.e_factory_pattern_pizza

import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Cheese
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Clam
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Dough
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Sauce

abstract class Pizza {
    var name: String? = null
    protected var dough: Dough? = null
    protected var sauce: Sauce? = null
    protected var cheese: Cheese? = null
    protected var clam: Clam? = null
    abstract fun prepare()

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }
    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }
    open fun box() {
        println("Place pizza in official PizzaStore box.")
    }
}
