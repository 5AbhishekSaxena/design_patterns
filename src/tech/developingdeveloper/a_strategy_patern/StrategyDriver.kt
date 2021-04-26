package tech.developingdeveloper.a_strategy_patern

import tech.developingdeveloper.a_strategy_patern.display.DisplayAsGraphic
import tech.developingdeveloper.a_strategy_patern.display.DisplayAsText
import tech.developingdeveloper.a_strategy_patern.fly.JetFly
import tech.developingdeveloper.a_strategy_patern.fly.SimpleFly
import tech.developingdeveloper.a_strategy_patern.quack.NoQuack
import tech.developingdeveloper.a_strategy_patern.quack.SimpleQuack


/**
 * Created by Abhishek Saxena on 22-02-2021.
 */


fun main() {

    val cityDuck = tech.developingdeveloper.a_strategy_patern.Duck(
            SimpleFly(),
            SimpleQuack(),
            DisplayAsText()
    )

    println("City Duck")
    cityDuck.fly()
    cityDuck.quack()
    cityDuck.display()

    val wildDuck = tech.developingdeveloper.a_strategy_patern.Duck(
            SimpleFly(),
            SimpleQuack(),
            DisplayAsGraphic()
    )

    println("\nWild Duck")
    wildDuck.fly()
    wildDuck.quack()
    wildDuck.display()

    val rubberDuck = tech.developingdeveloper.a_strategy_patern.Duck(
            JetFly(),
            NoQuack(),
            DisplayAsGraphic()
    )

    println("\nRubber Duck")
    rubberDuck.fly()
    rubberDuck.quack()
    rubberDuck.display()

}