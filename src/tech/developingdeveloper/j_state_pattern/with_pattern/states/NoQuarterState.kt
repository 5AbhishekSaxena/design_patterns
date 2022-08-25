package tech.developingdeveloper.j_state_pattern.with_pattern.states

import tech.developingdeveloper.j_state_pattern.with_pattern.GumballMachineWithStatePattern

class NoQuarterState(
    private val gumballMachine: GumballMachineWithStatePattern
) : State {
    override fun insertQuarter() {
        println("You inserted a quarter.")
        gumballMachine.state = gumballMachine.hasQuarterState
    }

    override fun ejectQuarter() {
        println("You haven't inserted aa quarter.")
    }

    override fun turnCrank() {
        println("You turned, but there is no quarter.")
    }

    override fun dispense() {
        println("You need a pay first.")
    }
}