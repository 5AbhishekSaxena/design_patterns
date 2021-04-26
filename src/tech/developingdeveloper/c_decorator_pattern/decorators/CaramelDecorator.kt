package tech.developingdeveloper.c_decorator_pattern.decorators

import tech.developingdeveloper.c_decorator_pattern.base.Beverage


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

class CaramelDecorator(
        beverage: Beverage
) : AddOnDecorator() {

    override val cost = beverage.cost + 2
}