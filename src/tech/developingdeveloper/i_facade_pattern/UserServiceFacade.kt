package tech.developingdeveloper.i_facade_pattern

import tech.developingdeveloper.i_facade_pattern.models.Student


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

interface UserServiceFacade {

    fun getStudentDetails(): Student
}