package tech.developingdeveloper.e_factory_pattern_pizza


class PizzaStore(
    private val factory: SimplePizzaFactory
) {

    fun orderPizza(type: String): Pizza {
        val pizza: Pizza = factory.createPizza(type)

        pizza.also {
            it.prepare()
            it.bake()
            it.cut()
            it.box()
        }
        return pizza
    }
}

