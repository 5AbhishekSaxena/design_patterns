package tech.developingdeveloper.g_command_pattern.invoker

import tech.developingdeveloper.g_command_pattern.commands.Command
import tech.developingdeveloper.g_command_pattern.commands.LightOffCommand
import tech.developingdeveloper.g_command_pattern.commands.LightOnCommand


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

class Invoker(
    private val lightOnCommand: LightOnCommand,
    private val lightOffCommand: LightOffCommand
) {

    private val commandQueue = mutableListOf<Command>()

    fun pressOn() {
        lightOnCommand.execute()
        commandQueue.add(lightOnCommand)
    }

    fun pressOff() {
        lightOffCommand.execute()
        commandQueue.add(lightOffCommand)
    }

    fun undoAllCommandsAndClearHistory() {
        val iterator = commandQueue.listIterator(commandQueue.size)
        while (iterator.hasPrevious()) {
            val lastCommand = iterator.previous()
            lastCommand.unExecute()
            iterator.remove()
        }
    }
}