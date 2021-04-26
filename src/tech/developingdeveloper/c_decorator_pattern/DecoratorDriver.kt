package tech.developingdeveloper.c_decorator_pattern

import tech.developingdeveloper.c_decorator_pattern.base.Decaf
import tech.developingdeveloper.c_decorator_pattern.base.Espresso
import tech.developingdeveloper.c_decorator_pattern.decorators.CaramelDecorator
import tech.developingdeveloper.c_decorator_pattern.decorators.SoyDecorator


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

fun main() {
    val orderOneBaseBeverage = Espresso()
    val orderOneAddOnOne = CaramelDecorator(orderOneBaseBeverage)

    println("Order 1: ${orderOneAddOnOne.cost}")

    val orderTwoBaseBeverage = Decaf()
    val orderTwoAddOnOne = SoyDecorator(orderTwoBaseBeverage)
    val orderTwoAddOnTwo = CaramelDecorator(orderTwoAddOnOne)

    println("Order 2: ${orderTwoAddOnTwo.cost}")

}