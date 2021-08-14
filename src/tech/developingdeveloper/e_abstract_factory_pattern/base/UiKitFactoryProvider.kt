package tech.developingdeveloper.e_abstract_factory_pattern.base

import tech.developingdeveloper.e_abstract_factory_pattern.mac.MacUiKitFactory
import tech.developingdeveloper.e_abstract_factory_pattern.windows.WindowsUiKitFactory


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

object UiKitFactoryProvider {

    fun createUiKitFactory(type: String): UiKitFactory {
        return when {
            type.equals("Mac", ignoreCase = true) -> MacUiKitFactory()
            type.equals("Windows", ignoreCase = true) -> WindowsUiKitFactory()
            else -> throw IllegalArgumentException("Type must be either 'Mac' or 'Windows'")
        }
    }
}