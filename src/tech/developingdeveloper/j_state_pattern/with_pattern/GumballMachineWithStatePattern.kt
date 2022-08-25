package tech.developingdeveloper.j_state_pattern.with_pattern

import tech.developingdeveloper.j_state_pattern.GumballMachine
import tech.developingdeveloper.j_state_pattern.getGumballDescription
import tech.developingdeveloper.j_state_pattern.with_pattern.states.HasQuarterState
import tech.developingdeveloper.j_state_pattern.with_pattern.states.NoQuarterState
import tech.developingdeveloper.j_state_pattern.with_pattern.states.SoldOutState
import tech.developingdeveloper.j_state_pattern.with_pattern.states.SoldState
import tech.developingdeveloper.j_state_pattern.with_pattern.states.State
import tech.developingdeveloper.j_state_pattern.with_pattern.states.WinnerState


class GumballMachineWithStatePattern(count: Int): GumballMachine {

    var count: Int = count
        private set

    val hasQuarterState: HasQuarterState = HasQuarterState(this)
    val noQuarterState: NoQuarterState = NoQuarterState(this)
    val soldState: SoldState = SoldState(this)
    val soldOutState: SoldOutState = SoldOutState(this)
    val winnerState: WinnerState = WinnerState(this)

    var state: State

    init {
        state = if (count > 0)
            hasQuarterState
        else
            soldOutState
    }

    override fun insertQuarter() {
        state.insertQuarter()
    }

    override fun ejectQuarter() {
        state.ejectQuarter()
    }

    override fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count > 0) {
            count--
        }
    }

    override fun toString(): String {
        return getGumballDescription(count)
    }

}