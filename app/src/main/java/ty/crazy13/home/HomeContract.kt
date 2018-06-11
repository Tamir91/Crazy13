package ty.crazy13.home

import ty.crazy13.base.mvp.MvpPresenter
import ty.crazy13.base.mvp.MvpView

interface HomeContract{

    interface View : MvpView{

    }

    interface Presenter: MvpPresenter<View>{

    }
}