package tech.developingdeveloper.e_factory_pattern_pizza

abstract class Pizza {
    abstract val name: String
    protected abstract val dough: String
    protected abstract val sauce: String
    protected abstract val toppings: List<String>

    open fun prepare(){
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ${toppings.joinToString()}")
    }
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
