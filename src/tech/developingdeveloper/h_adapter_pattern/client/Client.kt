package tech.developingdeveloper.h_adapter_pattern.client

import tech.developingdeveloper.h_adapter_pattern.adapter.ITarget


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

class Client(
    private val target: ITarget
) {
    fun executeRequest() {
        target.request()
    }
}