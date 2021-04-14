package tech.developingdeveloper.kotlin.c_decorator_pattern.base


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

class Espresso(override val cost: Double = 5.6) : Beverage() {
    override fun description(): String = "Coffee with milk, good for skin"
}