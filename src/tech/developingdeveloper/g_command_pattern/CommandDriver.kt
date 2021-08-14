package tech.developingdeveloper.g_command_pattern

import tech.developingdeveloper.g_command_pattern.commands.LightOffCommand
import tech.developingdeveloper.g_command_pattern.commands.LightOnCommand
import tech.developingdeveloper.g_command_pattern.invoker.Invoker
import tech.developingdeveloper.g_command_pattern.receiver.Light


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

fun main() {
    val light = Light()

    val lightOnCommand = LightOnCommand(light)
    val lightOffCommand = LightOffCommand(light)

    val invoker = Invoker(lightOnCommand, lightOffCommand)

    invoker.pressOn()
    invoker.pressOff()
}