package tech.developingdeveloper.i_facade_pattern

import tech.developingdeveloper.i_facade_pattern.services.AddressService
import tech.developingdeveloper.i_facade_pattern.services.BasicUserDetailsService
import tech.developingdeveloper.i_facade_pattern.services.ContactDetailsService
import tech.developingdeveloper.i_facade_pattern.services.MarksService


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

// client
fun main() {

    val basicUserDetailsService = BasicUserDetailsService()
    val addressService = AddressService()
    val contactDetailsService = ContactDetailsService()
    val marksService = MarksService()

    val userServiceFacade = UserServiceFacadeImpl(
        basicUserDetailsService, addressService, marksService, contactDetailsService
    )

    println(userServiceFacade.getStudentDetails())
}