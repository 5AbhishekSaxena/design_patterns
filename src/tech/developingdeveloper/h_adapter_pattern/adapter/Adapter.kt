package tech.developingdeveloper.h_adapter_pattern.adapter

import tech.developingdeveloper.h_adapter_pattern.adaptee.Adaptee

class Adapter(
    private val adaptee: Adaptee
): ITarget {
    override fun request() {
        adaptee.specificRequest()
    }
}