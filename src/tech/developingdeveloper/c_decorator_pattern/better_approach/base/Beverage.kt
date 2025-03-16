package tech.developingdeveloper.c_decorator_pattern.better_approach.base

import tech.developingdeveloper.c_decorator_pattern.better_approach.addons.AddOns


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

abstract class Beverage(
        private val addOns: Collection<AddOns> = emptyList()
) {

    abstract val cost: Double

    fun calculateAmount(): Double {
        val addOnAmount = addOns.sumOf { it.cost }
        return cost + addOnAmount
    }
}