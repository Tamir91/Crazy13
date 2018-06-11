package ty.crazy13.home

import android.util.Log
import ty.crazy13.base.mvp.BasePresenter

class HomePresenter : BasePresenter<HomeContract.View>(), HomeContract.Presenter {
    private val TAG = HomePresenter::class.simpleName

    override fun viewIsReady() {
        Log.d(TAG, "viewIsReady::in")
    }

    override fun attachView(mvpView: HomeContract.View) {
        super.attachView(mvpView)
    }

    override fun detachView() {
        super.detachView()
    }


    override fun destroy() {
    }

    override fun onStop() {
    }
}