package tech.developingdeveloper.g_command_pattern.commands

import tech.developingdeveloper.g_command_pattern.receiver.Light

class LightOffCommand(
    private val light: Light
) : Command {

    override fun execute() = light.off()

    override fun unExecute() = light.on()
}