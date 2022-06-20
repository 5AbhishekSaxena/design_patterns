package tech.developingdeveloper.e_factory_pattern_pizza


abstract class PizzaStore {
    protected abstract fun createPizza(type: String): Pizza

    fun orderPizza(type: String): Pizza {
        val pizza: Pizza = createPizza(type)

        pizza.also {
            it.prepare()
            it.bake()
            it.cut()
            it.box()
        }
        return pizza
    }
}

