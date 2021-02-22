package b_observer_pattern.observers

import b_observer_pattern.observables.WeatherStation

class PhoneDisplay(private val weatherStation: WeatherStation) : IObserver {
    override fun update() {
        println(
            "phone display update, temperature: ${
                weatherStation.temperature
            }"
        )
    }
}