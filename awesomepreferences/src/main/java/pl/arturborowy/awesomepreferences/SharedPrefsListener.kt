package pl.arturborowy.awesomepreferences

import kotlin.reflect.KProperty

interface SharedPrefsListener {

    fun onSharedPrefChanged(property: KProperty<*>)
}