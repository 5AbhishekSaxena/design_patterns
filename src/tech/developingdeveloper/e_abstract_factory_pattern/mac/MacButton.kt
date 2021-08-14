package tech.developingdeveloper.e_abstract_factory_pattern.mac

import tech.developingdeveloper.e_abstract_factory_pattern.base.Button

class MacButton : Button() {

    override fun toString(): String {
        return "This is Mac Button"
    }
}
