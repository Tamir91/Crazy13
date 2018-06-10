package ty.crazy13.app.dagger

import dagger.Component
import ty.crazy13.HomeActivity
import javax.inject.Singleton

@Singleton
@Component(
        modules = [AppModule::class]
)
interface AppComponent {
    fun inject(homeActivity: HomeActivity)

}