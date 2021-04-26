package tech.developingdeveloper.b_observer_pattern.observers

import tech.developingdeveloper.b_observer_pattern.observables.WeatherStation


/**
 * Created by Abhishek Saxena on 22-02-2021.
 */

class DesktopDisplay(
    private val weatherStation: WeatherStation
) : IObserver {
    override fun update() {
        println(
            "desktop display update, temperature: ${
                weatherStation.temperature
            }"
        )
    }
}