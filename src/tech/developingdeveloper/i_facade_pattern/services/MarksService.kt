package tech.developingdeveloper.i_facade_pattern.services

import tech.developingdeveloper.i_facade_pattern.models.Marks


/**
 * Created by Abhishek Saxena on 19-08-2021.
 */

class MarksService {
    fun getMarks(name: String): Marks {
        return Marks(82)
    }
}