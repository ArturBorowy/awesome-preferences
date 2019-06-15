package pl.arturborowy.data.local

import android.content.Context
import pl.arturborowy.awesomepreferences.Preferences
import javax.inject.Singleton

@Singleton
class Settings(context: Context) : Preferences(context)