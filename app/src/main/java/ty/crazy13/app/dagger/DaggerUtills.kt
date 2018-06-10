package ty.crazy13.app.dagger

import android.support.v7.app.AppCompatActivity
import ty.crazy13.app.App


val AppCompatActivity.component: AppComponent
    get() = (application as App).appComponent
