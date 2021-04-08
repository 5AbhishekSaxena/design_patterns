package c_decorator_pattern.base


abstract class Beverage {
    abstract val cost: Double
    open fun description(): String =
            "Basic beverage"
}
