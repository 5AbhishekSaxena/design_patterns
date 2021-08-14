package tech.developingdeveloper.e_abstract_factory_pattern

import tech.developingdeveloper.e_abstract_factory_pattern.base.UiKitFactoryProvider


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

fun main() {

    val uiKitFactoryProvider = UiKitFactoryProvider()

    val windowsFactory = uiKitFactoryProvider.createUiKitFactory("Windows")
    val windowsAlertDialog = windowsFactory.createAlertDialog()
    val windowsButton = windowsFactory.createButton()
    println("windowsAlertDialog = $windowsAlertDialog, windowsButton: $windowsButton")

    val macFactory = uiKitFactoryProvider.createUiKitFactory("Mac")
    val macAlertDialog = macFactory.createAlertDialog()
    val macButton = macFactory.createButton()
    println("macAlertDialog = $macAlertDialog, macButton: $macButton")
}