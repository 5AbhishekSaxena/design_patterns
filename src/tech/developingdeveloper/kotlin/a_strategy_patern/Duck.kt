package tech.developingdeveloper.kotlin.a_strategy_patern

import tech.developingdeveloper.kotlin.a_strategy_patern.display.IDisplay
import tech.developingdeveloper.kotlin.a_strategy_patern.fly.IFly
import tech.developingdeveloper.kotlin.a_strategy_patern.quack.IQuack


/**
 * Created by Abhishek Saxena on 22-02-2021.
 */

class Duck(
    private val fly: IFly,
    private val quack: IQuack,
    private val display: IDisplay
) : IFly by fly, IQuack by quack, IDisplay by display