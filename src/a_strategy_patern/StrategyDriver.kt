package a_strategy_patern

import a_strategy_patern.display.DisplayAsGraphic
import a_strategy_patern.display.DisplayAsText
import a_strategy_patern.fly.JetFly
import a_strategy_patern.fly.SimpleFly
import a_strategy_patern.quack.NoQuack
import a_strategy_patern.quack.SimpleQuack


/**
 * Created by Abhishek Saxena on 22-02-2021.
 */


fun main() {

    val cityDuck = Duck(
        SimpleFly(),
        SimpleQuack(),
        DisplayAsText()
    )

    println("City Duck")
    cityDuck.fly()
    cityDuck.quack()
    cityDuck.display()

    val wildDuck = Duck(
        SimpleFly(),
        SimpleQuack(),
        DisplayAsGraphic()
    )

    println("\nWild Duck")
    wildDuck.fly()
    wildDuck.quack()
    wildDuck.display()

    val rubberDuck = Duck(
        JetFly(),
        NoQuack(),
        DisplayAsGraphic()
    )

    println("\nRubber Duck")
    rubberDuck.fly()
    rubberDuck.quack()
    rubberDuck.display()

}