package tech.developingdeveloper.e_abstract_factory_pattern.base

import tech.developingdeveloper.e_abstract_factory_pattern.base.AlertDialog
import tech.developingdeveloper.e_abstract_factory_pattern.base.Button


/**
 * Created by Abhishek Saxena on 14-08-2021.
 */

interface UiKitFactory {

    fun createAlertDialog(): AlertDialog

    fun createButton(): Button

}