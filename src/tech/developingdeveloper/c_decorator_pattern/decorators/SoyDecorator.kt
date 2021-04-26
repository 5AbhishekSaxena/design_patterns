package tech.developingdeveloper.c_decorator_pattern.decorators

import tech.developingdeveloper.c_decorator_pattern.base.Beverage


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

class SoyDecorator(beverage: Beverage) : AddOnDecorator() {
    override val cost: Double = beverage.cost + 3.4
}