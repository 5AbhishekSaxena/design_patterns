package c_decorator_pattern.decorators

import c_decorator_pattern.base.Beverage


/**
 * Created by Abhishek Saxena on 08-04-2021.
 */

abstract class AddOnDecorator : Beverage() {
    override fun description(): String {
        return "Basic add-on!"
    }
}