package tech.developingdeveloper.l_bridge_pattern.view

import tech.developingdeveloper.l_bridge_pattern.resource.Resource

abstract class View {
    protected abstract val resource: Resource
    abstract fun show()
}
