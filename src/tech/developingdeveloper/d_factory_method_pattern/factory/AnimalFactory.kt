package tech.developingdeveloper.d_factory_method_pattern.factory

import tech.developingdeveloper.d_factory_method_pattern.products.Animal


/**
 * Created by Abhishek Saxena on 14-04-2021.
 */

interface AnimalFactory {
    fun createAnimal(): Animal
}