package tech.developingdeveloper.h_adapter_pattern

import tech.developingdeveloper.h_adapter_pattern.adaptee.Adaptee
import tech.developingdeveloper.h_adapter_pattern.adapter.Adapter
import tech.developingdeveloper.h_adapter_pattern.client.Client


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

// this is the client
fun main() {
    val adaptee = Adaptee()
    val target = Adapter(adaptee)
    target.request()

    // another way to do the same thing as it we are wrapping the adapter pattern using a client

    val client = Client(target)
    client.executeRequest() // this will call `target.request()`

}