package tech.developingdeveloper.j_state_pattern


fun getGumballDescription(count: Int): String {
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