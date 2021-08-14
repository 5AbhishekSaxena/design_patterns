package tech.developingdeveloper.g_command_pattern.commands

import tech.developingdeveloper.g_command_pattern.receiver.Light

class LightOnCommand(
    private val light: Light
) : Command {

    override fun execute() = light.on()

    override fun unExecute() = light.off()
}