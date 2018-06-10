package ty.crazy13.app

import android.app.Application
import ty.crazy13.app.dagger.AppComponent
import ty.crazy13.app.dagger.AppModule
import ty.crazy13.app.dagger.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

       appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}