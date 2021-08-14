package tech.developingdeveloper.e_abstract_factory_pattern.windows

import tech.developingdeveloper.e_abstract_factory_pattern.base.Button

class WindowsButton : Button() {

    override fun toString(): String {
        return "This is Windows Button"
    }
}
