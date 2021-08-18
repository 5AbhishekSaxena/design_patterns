package tech.developingdeveloper.i_facade_pattern.services

import tech.developingdeveloper.i_facade_pattern.models.Address


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

class AddressService {

    fun getAddress(name: String): Address {
        return Address("India")
    }
}