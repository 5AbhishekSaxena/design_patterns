package tech.developingdeveloper.kotlin.d_factory_method_pattern.factory

import tech.developingdeveloper.kotlin.d_factory_method_pattern.products.Animal
import tech.developingdeveloper.kotlin.d_factory_method_pattern.products.Cat
import tech.developingdeveloper.kotlin.d_factory_method_pattern.products.Dog
import tech.developingdeveloper.kotlin.d_factory_method_pattern.products.Duck


/**
 * Created by Abhishek Saxena on 14-04-2021.
 */

class BalancedAnimalFactory : AnimalFactory {

    private val animalCount = mutableMapOf(
            "Dog" to 0,
            "Cat" to 0,
            "Duck" to 0
    )

    override fun createAnimal(): Animal {
        val animals = listOf(Dog(), Cat(), Duck())
        val (min, max) = findAnimalAvailableForGeneration()
        return if (min == max) animals.findAnimal().also {
            animalCount.incrementMapCount(it)
        }
        else animalCount.filter { it.value != max }.keys.generateAnimals().findAnimal().also {
            animalCount.incrementMapCount(it)
        }
    }

    private fun findAnimalAvailableForGeneration(): List<Int> {

        var max = 0
        var min = Int.MAX_VALUE

        animalCount.forEach {
            if (it.value >= max) max = it.value
            if (it.value <= min) min = it.value
        }
        return listOf(min, max)
    }

    private fun List<Animal>.findAnimal(): Animal {
        return shuffled()[0]
    }

    private fun MutableMap<String, Int>.incrementMapCount(animal: Animal) {
        if (containsKey(animal.javaClass.simpleName)) {
            this[animal.javaClass.simpleName] = this[animal.javaClass.simpleName]?.plus(1)!!
        }
    }

    private fun Set<String>.generateAnimals(): List<Animal> {
        val animals = mutableListOf<Animal>()
        forEach {
            when (it) {
                "Dog" -> animals.add(Dog())
                "Cat" -> animals.add(Cat())
                "Duck" -> animals.add(Duck())
            }
        }
        return animals
    }
}