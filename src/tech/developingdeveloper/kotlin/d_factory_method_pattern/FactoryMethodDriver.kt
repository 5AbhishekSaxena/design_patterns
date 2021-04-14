package tech.developingdeveloper.kotlin.d_factory_method_pattern

import tech.developingdeveloper.kotlin.d_factory_method_pattern.factory.BalancedAnimalFactory
import tech.developingdeveloper.kotlin.d_factory_method_pattern.factory.RandomAnimalFactory


/**
 * Created by Abhishek Saxena on 14-04-2021.
 */


fun main() {
    val randomAnimalFactory = RandomAnimalFactory()
    val balancedAnimalFactory = BalancedAnimalFactory()
    println("Random")
    for (i in 1..10) {
        println(randomAnimalFactory.createAnimal())
    }
    println("\nBalanced")
    for (i in 1..10) {
        println(balancedAnimalFactory.createAnimal())
    }
}