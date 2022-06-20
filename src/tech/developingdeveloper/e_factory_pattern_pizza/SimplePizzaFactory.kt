package tech.developingdeveloper.e_factory_pattern_pizza

class SimplePizzaFactory {

    fun createPizza(type: String) = when (type) {
        "cheese" -> CheesePizza()
        "greek" -> GreekPizza()
        "pepperoni" -> PepperoniPizza()
        else -> throw IllegalArgumentException()
    }

}