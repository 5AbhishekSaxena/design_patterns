package tech.developingdeveloper.e_abstract_factory_pattern.mac

import tech.developingdeveloper.e_abstract_factory_pattern.base.AlertDialog

class MacAlertDialog : AlertDialog() {

    override fun toString(): String {
        return "This is Mac AlertDialog"
    }
}
