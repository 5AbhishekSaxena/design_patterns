package tech.developingdeveloper.e_factory_pattern_pizza.ny

import tech.developingdeveloper.e_factory_pattern_pizza.Pizza

class NYCheesePizza : Pizza(){
    override val name: String = "NY Style Sauce and Cheese Pizza."
    override val dough: String = "Thin Crust Dough"
    override val sauce: String = "Marinara Sauce"
    override val toppings: List<String> = listOf("Grated Reggiano Cheese")
}