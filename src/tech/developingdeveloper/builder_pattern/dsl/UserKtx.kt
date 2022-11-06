package tech.developingdeveloper.builder_pattern.dsl

import tech.developingdeveloper.builder_pattern.Address
import tech.developingdeveloper.builder_pattern.Company
import tech.developingdeveloper.builder_pattern.Contact
import tech.developingdeveloper.builder_pattern.Education
import tech.developingdeveloper.builder_pattern.EducationBuilder
import tech.developingdeveloper.builder_pattern.User

//region Annotation
@DslMarker
annotation class UserBuilderDsl
//endregion

//region UserDsl Scopes
@UserBuilderDsl
class UserScope : User.Builder()

@UserBuilderDsl
class AddressScope : Address.Builder()

@UserBuilderDsl
class CompanyScope : Company.Builder()

@UserBuilderDsl
class ContactScope : Contact.Builder()

@UserBuilderDsl
class EducationListScope {
    private val _educationList = mutableListOf<Education>()
    val educationList: List<Education>
        get() = _educationList.toList()

    val graduated: EmptyEducation = EmptyEducation()

    fun addEducation(education: Education) {
        _educationList.add(education)
    }

    operator fun Education.unaryPlus() {
        _educationList.add(this)
    }

    inner class EmptyEducation {
        infix fun from(school: String) = EducationWithSchool(school)
    }

    inner class EducationWithSchool(val school: String) {
        infix fun inTheYear(year: Int) = EducationWithSchoolAndYear(this, year)
    }

    inner class EducationWithSchoolAndYear(private val previous: EducationWithSchool, private val year: Int) {
        infix fun with(degree: String) {
            val education = Education(previous.school, year, degree)
            _educationList.add(education)
        }
    }

}

@UserBuilderDsl
class EducationScope : EducationBuilder()

//endregion

//region User Dsl
fun buildUser(block: UserScope.() -> Unit): User {
    return UserScope().apply(block).build()
}

inline fun UserScope.address(block: AddressScope.() -> Unit) {
    address = AddressScope().apply(block).build()
}

inline fun UserScope.company(block: CompanyScope.() -> Unit) {
    company = CompanyScope().apply(block).build()
}

inline fun UserScope.contact(block: ContactScope.() -> Unit) {
    contact = ContactScope().apply(block).build()
}

inline fun UserScope.educationList(block: EducationListScope.() -> Unit) {
    educations = EducationListScope().apply(block).educationList
}

inline fun UserScope.education(block: EducationScope.() -> Unit) {
    val education = EducationScope().apply(block).build()
    addEducation(education)
}

inline fun EducationListScope.education(block: EducationScope.() -> Unit) {
    val education = EducationScope().apply(block).build()
    addEducation(education)
}

fun EducationListScope.education(school: String, yearOfPassing: Int, degree: String) {
    val education = EducationBuilder()
        .setSchool(school)
        .setDegree(degree)
        .setYearOfPassing(yearOfPassing)
        .build()
    addEducation(education)
}

//endregion