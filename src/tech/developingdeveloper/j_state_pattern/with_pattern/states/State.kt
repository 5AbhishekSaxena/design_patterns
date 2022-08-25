package tech.developingdeveloper.j_state_pattern.with_pattern.states


interface State {

    fun insertQuarter()

    fun ejectQuarter()

    fun turnCrank()

    fun dispense()

}