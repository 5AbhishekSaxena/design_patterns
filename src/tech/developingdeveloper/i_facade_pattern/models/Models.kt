package tech.developingdeveloper.i_facade_pattern.models

data class Student(
    val name: String,
    val address: Address,
    val contactDetails: ContactDetails,
    val marks: Marks
)

data class Address(
    val country: String
)

data class ContactDetails(
    val number: String
)

data class Marks(
    val score: Int
)