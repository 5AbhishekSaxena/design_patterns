package tech.developingdeveloper.e_factory_pattern_pizza

class CheesePizza(
    private val pizzaIngredientFactory: PizzaIngredientFactory
) : Pizza(){
    override fun prepare() {
        println("Preparing $name")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
    }
}
