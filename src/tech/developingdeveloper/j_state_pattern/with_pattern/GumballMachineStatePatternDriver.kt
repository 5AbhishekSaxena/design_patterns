package tech.developingdeveloper.j_state_pattern.with_pattern

import tech.developingdeveloper.j_state_pattern.GumballMachine


fun main() {

    val gumballMachine: GumballMachine = GumballMachineWithStatePattern(5)

    println("\n$gumballMachine\n")

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println("\n$gumballMachine\n")

    gumballMachine.insertQuarter()
    gumballMachine.ejectQuarter()
    gumballMachine.turnCrank()

    println("\n$gumballMachine\n")

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.ejectQuarter()

    println("\n$gumballMachine\n")

    gumballMachine.insertQuarter()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println("\n$gumballMachine\n")



}