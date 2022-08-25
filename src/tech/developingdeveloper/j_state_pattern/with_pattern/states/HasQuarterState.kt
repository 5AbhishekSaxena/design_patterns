package tech.developingdeveloper.j_state_pattern.with_pattern.states

import tech.developingdeveloper.j_state_pattern.with_pattern.GumballMachineWithStatePattern
import kotlin.random.Random

class HasQuarterState(
    private val gumballMachine: GumballMachineWithStatePattern
) : State {

    override fun insertQuarter() {
        println("You cannot insert another quarter.")
    }

    override fun ejectQuarter() {
        gumballMachine.state = gumballMachine.noQuarterState
        println("Quarter returned.")
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = Random.nextInt(10)
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.state = gumballMachine.winnerState
        } else {
            gumballMachine.state = gumballMachine.soldState
        }
    }

    override fun dispense() {
        println("No gumball dispensed.")
    }
}