package tech.developingdeveloper.j_state_pattern.with_pattern.states

import tech.developingdeveloper.j_state_pattern.with_pattern.GumballMachineWithStatePattern

class SoldState(
    private val gumballMachine: GumballMachineWithStatePattern
) : State {
    override fun insertQuarter() {
        println("Please wait, we're already giving you a gumball.")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank.")
    }

    override fun turnCrank() {
        println("Turning twice doesn't get you another gumball.")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.count > 0 ) {
            gumballMachine.state = gumballMachine.noQuarterState
        } else {
            println("Oops, out of gumballs")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }
}