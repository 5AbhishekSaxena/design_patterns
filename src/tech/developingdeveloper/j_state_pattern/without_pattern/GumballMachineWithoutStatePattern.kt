package tech.developingdeveloper.j_state_pattern.without_pattern


class GumballMachineWithoutStatePattern(
    private var count: Int
) {

    private var state: Int = SOLD_OUT

    init {
        if (count > 0)
            state = NO_QUARTER
    }

    fun insertQuarter() {
        when (state) {
            HAS_QUARTER -> {
                println("You cannot insert another quarter.")
            }

            NO_QUARTER -> {
                state = HAS_QUARTER
                println("You inserted a quarter.")
            }

            SOLD_OUT -> {
                println("You can't insert a quarter, the machine is sold out.")
            }

            SOLD -> {
                println("Please wait, we're already giving you a gumball.")
            }
        }
    }

    fun ejectQuarter() {
        when (state) {
            HAS_QUARTER -> {
                println("Quarter returned.")
                state = NO_QUARTER
            }

            NO_QUARTER -> {
                println("You haven't inserted a quarter")
            }

            SOLD_OUT -> {
                println("You can't eject, you haven't inserted a quarter yet")
            }

            SOLD -> {
                println("Sorry, you already turned the crank.")
            }
        }
    }

    fun turnCrank() {
        when (state) {
            HAS_QUARTER -> {
                println("You turned...")
                state = SOLD
                dispense()
            }

            NO_QUARTER -> {
                println("You turned but there's no quarter.")
            }

            SOLD_OUT -> {
                println("You turned but there are no gumballs.")
            }

            SOLD -> {
                println("Turning twice doesn't get you another gumball.")
            }
        }
    }

    private fun dispense() {
        when (state) {
            HAS_QUARTER -> {
                println("You need to turn the crank.")
            }

            NO_QUARTER -> {
                println("You need to pay first.")
            }

            SOLD_OUT -> {
                println("No gumball dispensed.")
            }

            SOLD -> {
                println("A gumball comes rolling out the slot.")
                count--
                if (count == 0) {
                    println("Oops, out of gumballs.")
                    state = SOLD_OUT
                } else {
                    state = NO_QUARTER
                }
            }
        }
    }

    override fun toString(): String {
        return buildString {
            append("Mighty Gumball Inc.")
            append("\n")
            append("Java-enabled Standing Gumball Model #2004")
            append("\n")
            append("Inventory: $count gumball(s)")
            append("\n")

            if (count > 0)
                append("Machine is waiting for a quarter")
            else
                append("Machine is sold out.")
        }
    }


    companion object {
        private const val SOLD_OUT = 0
        private const val NO_QUARTER = 1
        private const val HAS_QUARTER = 2
        private const val SOLD = 3
    }
}