package tech.developingdeveloper.g_command_pattern.invoker

import tech.developingdeveloper.g_command_pattern.commands.LightOffCommand
import tech.developingdeveloper.g_command_pattern.commands.LightOnCommand


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

class Invoker(
    private val lightOnCommand: LightOnCommand,
    private val lightOffCommand: LightOffCommand
) {
    fun pressOn() = lightOnCommand.execute()

    fun pressOff() = lightOffCommand.execute()
}