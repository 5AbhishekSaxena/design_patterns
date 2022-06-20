package tech.developingdeveloper.e_factory_pattern_pizza.chicago

import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Cheese
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Clam
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Dough
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.FrozenClam
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.MozzarellaCheese
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Pepperoni
import tech.developingdeveloper.e_factory_pattern_pizza.PizzaIngredientFactory
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.PlumTomatoSauce
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Sauce
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.SlicedPepperoni
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.ThickCrustDough

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clam {
        return FrozenClam()
    }
}