package tech.developingdeveloper.e_abstract_factory_pattern.windows

import tech.developingdeveloper.e_abstract_factory_pattern.base.AlertDialog

class WindowsAlertDialog : AlertDialog() {

    override fun toString(): String {
        return "This is Windows AlertDialog"
    }
}
