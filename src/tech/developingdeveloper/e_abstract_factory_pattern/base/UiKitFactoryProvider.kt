package tech.developingdeveloper.e_abstract_factory_pattern.base

import tech.developingdeveloper.e_abstract_factory_pattern.mac.MacUiKitFactory
import tech.developingdeveloper.e_abstract_factory_pattern.windows.WindowsUiKitFactory


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

/**
 * Helper class to create [UiKitFactory], use [createUiKitFactory] method to create an instance based on the type.
 */
object UiKitFactoryProvider {

    /**
     * A static method to create UiKitFactory using [type].
     *
     * @param type defines the type of factory to create.
     *
     * @throws IllegalArgumentException when the type doesn't match with any of the given factory
     */
    fun createUiKitFactory(type: String): UiKitFactory {
        return when {
            type.equals("Mac", ignoreCase = true) -> MacUiKitFactory()
            type.equals("Windows", ignoreCase = true) -> WindowsUiKitFactory()
            else -> throw IllegalArgumentException("Type must be either 'Mac' or 'Windows'")
        }
    }
}