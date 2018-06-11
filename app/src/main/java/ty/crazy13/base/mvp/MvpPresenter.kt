package ty.crazy13.base.mvp

interface MvpPresenter<V : MvpView> {

    fun  attachView(mvpView: V)

    fun viewIsReady()

    fun detachView()

    fun destroy()

    fun onStop()//Unsubscribe from observable

}