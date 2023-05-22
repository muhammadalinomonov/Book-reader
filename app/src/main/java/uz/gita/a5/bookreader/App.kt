package uz.gita.a5.bookreader

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import dagger.hilt.android.HiltAndroidApp
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MySharedPrefImpl.init(this)
    }
}