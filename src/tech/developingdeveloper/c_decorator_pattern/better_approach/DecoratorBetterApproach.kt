package tech.developingdeveloper.c_decorator_pattern.better_approach

import tech.developingdeveloper.c_decorator_pattern.better_approach.addons.Caramel
import tech.developingdeveloper.c_decorator_pattern.better_approach.addons.Soy
import tech.developingdeveloper.c_decorator_pattern.better_approach.base.Decaf
import tech.developingdeveloper.c_decorator_pattern.better_approach.base.Espresso


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

fun main() {

    val orderOne = Espresso(listOf(Caramel))

    println("orderOne: ${orderOne.calculateAmount()}")

    val orderTwo = Decaf(listOf(Caramel, Soy))

    println("orderTwo: ${orderTwo.calculateAmount()}")

}