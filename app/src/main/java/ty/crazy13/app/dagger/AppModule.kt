package ty.crazy13.app.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import ty.crazy13.home.HomePresenter
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context = application

    @Singleton
    @Provides
    fun provideHomePresenter() =  HomePresenter()
}
