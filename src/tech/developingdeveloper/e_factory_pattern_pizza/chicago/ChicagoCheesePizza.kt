package tech.developingdeveloper.e_factory_pattern_pizza.chicago

import tech.developingdeveloper.e_factory_pattern_pizza.Pizza

class ChicagoCheesePizza : Pizza() {
    override val name: String = "Chicago Style Deep Dish Cheese Pizza"
    override val dough: String = "Extra Thick Crust Dough"
    override val sauce: String = "Plum Tomato Sauce"
    override val toppings: List<String> = listOf("Shredded Mozzarella Cheese")

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}