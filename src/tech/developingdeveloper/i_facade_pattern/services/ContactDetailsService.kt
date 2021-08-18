package tech.developingdeveloper.i_facade_pattern.services

import tech.developingdeveloper.i_facade_pattern.models.ContactDetails


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

class ContactDetailsService {
    fun getContactDetails(name: String): ContactDetails {
        return ContactDetails(number = "1234567890")
    }
}