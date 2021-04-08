package c_decorator_pattern.better_approach.base

import c_decorator_pattern.better_approach.addons.AddOns


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

class Decaf(addOns: Collection<AddOns> = emptyList()) : Beverage(addOns) {
    override val cost: Double = 7.5
}