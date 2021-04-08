package c_decorator_pattern.better_approach.base

import c_decorator_pattern.better_approach.addons.AddOns


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

abstract class Beverage(
        private val addOns: Collection<AddOns>
) {

    abstract val cost: Double

    fun calculateAmount(): Double {
        var addOnAmount = 0.0
        addOns.forEach {
            addOnAmount += it.cost
        }

        return cost + addOnAmount
    }
}