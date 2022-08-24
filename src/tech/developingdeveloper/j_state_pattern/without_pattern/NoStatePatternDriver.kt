package tech.developingdeveloper.j_state_pattern.without_pattern


fun main() {
    val gumballMachine = GumballMachineWithoutStatePattern(5)

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