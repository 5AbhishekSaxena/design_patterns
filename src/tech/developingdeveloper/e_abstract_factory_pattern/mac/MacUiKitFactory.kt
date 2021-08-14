package tech.developingdeveloper.e_abstract_factory_pattern.mac

import tech.developingdeveloper.e_abstract_factory_pattern.base.AlertDialog
import tech.developingdeveloper.e_abstract_factory_pattern.base.Button
import tech.developingdeveloper.e_abstract_factory_pattern.base.UiKitFactory

class MacUiKitFactory : UiKitFactory {
    override fun createAlertDialog(): AlertDialog {
        return MacAlertDialog()
    }

    override fun createButton(): Button {
        return MacButton()
    }
}