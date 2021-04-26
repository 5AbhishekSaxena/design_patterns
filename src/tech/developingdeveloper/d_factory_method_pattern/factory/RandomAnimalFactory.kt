package tech.developingdeveloper.d_factory_method_pattern.factory

import tech.developingdeveloper.d_factory_method_pattern.products.Animal
import tech.developingdeveloper.d_factory_method_pattern.products.Cat
import tech.developingdeveloper.d_factory_method_pattern.products.Dog
import tech.developingdeveloper.d_factory_method_pattern.products.Duck

// stateless
class RandomAnimalFactory : AnimalFactory {
    override fun createAnimal(): Animal {
        val animals = listOf(Dog(), Cat(), Duck())
        return animals.shuffled()[0]
    }
}