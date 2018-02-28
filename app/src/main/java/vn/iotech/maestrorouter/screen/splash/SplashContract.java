package vn.iotech.maestrorouter.screen.splash;

import vn.iotech.base.viper.interfaces.IInteractor;
import vn.iotech.base.viper.interfaces.IPresenter;
import vn.iotech.base.viper.interfaces.PresentView;

/**
 * The Splash Contract
 */
interface SplashContract {

  interface Interactor extends IInteractor<Presenter> {
  }

  interface View extends PresentView<Presenter> {
    void showDialog();
  }

  interface Presenter extends IPresenter<View, Interactor> {
    void goToLogin(int time);
  }
}