package tech.developingdeveloper.e_factory_pattern_pizza.ny

import tech.developingdeveloper.e_factory_pattern_pizza.PizzaIngredientFactory
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Cheese
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Clam
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Dough
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.FreshClam
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.MarinaraSauce
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Pepperoni
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.ReggianoCheese
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.Sauce
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.SlicedPepperoni
import tech.developingdeveloper.e_factory_pattern_pizza.ingredients.ThinCrustDough

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clam {
        return FreshClam()
    }
}

