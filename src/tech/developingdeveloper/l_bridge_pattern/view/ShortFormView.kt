package tech.developingdeveloper.l_bridge_pattern.view

import tech.developingdeveloper.l_bridge_pattern.resource.Resource

class ShortFormView(override val resource: Resource) : View() {
    override fun show() {
        println("Showing short form view for resource - ${resource::class.simpleName}")
        println("Resource ID: ${resource.id}")
        println("Title: ${resource.title}")
        println("Image URL: ${resource.imageUrl}")
        println("Redirect Link: ${resource.redirectLink}")
    }
}
