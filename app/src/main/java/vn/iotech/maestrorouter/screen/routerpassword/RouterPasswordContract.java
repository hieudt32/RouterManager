package vn.iotech.maestrorouter.screen.routerpassword;

import vn.iotech.base.viper.interfaces.IInteractor;
import vn.iotech.base.viper.interfaces.IPresenter;
import vn.iotech.base.viper.interfaces.PresentView;

/**
 * The RouterPassword Contract
 */
interface RouterPasswordContract {

  interface Interactor extends IInteractor<Presenter> {
  }

  interface View extends PresentView<Presenter> {
  }

  interface Presenter extends IPresenter<View, Interactor> {
  }
}