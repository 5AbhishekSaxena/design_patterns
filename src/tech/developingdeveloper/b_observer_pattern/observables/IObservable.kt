package tech.developingdeveloper.b_observer_pattern.observables

import tech.developingdeveloper.b_observer_pattern.observers.IObserver


/**
 * Created by Abhishek Saxena on 22-02-2021.
 */

interface IObservable {
    fun registerObserver(observer: IObserver)
    fun unRegisterObserver(observer: IObserver)
    fun unRegisterAllObservers()
    fun notifyObservers()
}