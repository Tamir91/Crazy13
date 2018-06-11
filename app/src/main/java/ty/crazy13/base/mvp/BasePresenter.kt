package ty.crazy13.base.mvp

abstract class BasePresenter<T : MvpView> : MvpPresenter<T> {

    private var view : T? = null

    override fun attachView(mvpView: T) {
        view = mvpView
    }

    override fun detachView() {
        view = null
    }

    override fun destroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getView() = view

    fun isViewAttached() = view != null
}