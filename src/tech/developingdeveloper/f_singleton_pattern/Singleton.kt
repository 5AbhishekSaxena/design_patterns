package tech.developingdeveloper.f_singleton_pattern


/**
 * Created by Abhishek Saxena on 28-04-2021.
 */

class Singleton private constructor() {

    companion object {
        private var INSTANCE: Singleton? = null

        fun getInstance(): Singleton {
            if (INSTANCE == null) {
                val instance = Singleton()
                INSTANCE = instance
                return instance
            }
            return INSTANCE!!
        }
    }

    fun someMethod(): String {
        return "I am some method"
    }
}