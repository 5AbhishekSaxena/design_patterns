package tech.developingdeveloper.i_facade_pattern

import tech.developingdeveloper.i_facade_pattern.models.Student
import tech.developingdeveloper.i_facade_pattern.services.AddressService
import tech.developingdeveloper.i_facade_pattern.services.BasicUserDetailsService
import tech.developingdeveloper.i_facade_pattern.services.ContactDetailsService
import tech.developingdeveloper.i_facade_pattern.services.MarksService


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

class UserServiceFacadeImpl(
    private val basicUserDetailsService: BasicUserDetailsService,
    private val addressService: AddressService,
    private val marksService: MarksService,
    private val contactDetailsService: ContactDetailsService
): UserServiceFacade {

    override fun getStudentDetails(): Student {
        val name = basicUserDetailsService.getName()
        val address = addressService.getAddress(name)
        val contactDetails = contactDetailsService.getContactDetails(name)
        val marks = marksService.getMarks(name)

        return Student(name, address, contactDetails, marks)
    }
}