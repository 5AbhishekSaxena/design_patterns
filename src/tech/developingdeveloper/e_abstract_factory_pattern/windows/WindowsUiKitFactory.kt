package tech.developingdeveloper.e_abstract_factory_pattern.windows

import tech.developingdeveloper.e_abstract_factory_pattern.base.AlertDialog
import tech.developingdeveloper.e_abstract_factory_pattern.base.Button
import tech.developingdeveloper.e_abstract_factory_pattern.base.UiKitFactory

class WindowsUiKitFactory : UiKitFactory {
    override fun createAlertDialog(): AlertDialog {
        return WindowsAlertDialog()
    }

    override fun createButton(): Button {
        return WindowsButton()
    }
}
