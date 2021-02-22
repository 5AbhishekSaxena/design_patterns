package b_observer_pattern.observables

import b_observer_pattern.observers.IObserver

class WeatherStation : IObservable {

    private val observers = mutableListOf<IObserver>()

    var temperature = 0

    override fun registerObserver(observer: IObserver) {
        observers.add(observer)
    }


    override fun unRegisterObserver(observer: IObserver) {
        observers.remove(observer)
    }

    override fun unRegisterAllObservers() {
        observers.clear()
    }

    override fun notifyObservers() = observers.forEach {
        it.update()
    }
}