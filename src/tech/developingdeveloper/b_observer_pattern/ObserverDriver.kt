package tech.developingdeveloper.b_observer_pattern

import tech.developingdeveloper.b_observer_pattern.observables.WeatherStation
import tech.developingdeveloper.b_observer_pattern.observers.DesktopDisplay
import tech.developingdeveloper.b_observer_pattern.observers.PhoneDisplay


/**
 * Created by Abhishek Saxena on 22-02-2021.
 */

fun main(){
    val station = WeatherStation()

    val phoneDisplay = PhoneDisplay(station)
    val desktopDisplay = DesktopDisplay(station)

    station.registerObserver(phoneDisplay)
    station.registerObserver(desktopDisplay)

    station.notifyObservers()

    station.temperature = 20
    station.notifyObservers()

    station.temperature = -50
    station.notifyObservers()

    station.unRegisterObserver(desktopDisplay)

    station.temperature = 30
    station.notifyObservers()

    station.unRegisterAllObservers()

}