package vn.iotech.maestrorouter.screen.login;

import vn.iotech.base.viper.interfaces.IInteractor;
import vn.iotech.base.viper.interfaces.IPresenter;
import vn.iotech.base.viper.interfaces.PresentView;
import vn.iotech.maestrorouter.service.ServiceBuilder;

/**
 * The Login Contract
 */
interface LoginContract {

  interface Interactor extends IInteractor<Presenter> {
    void login(String name, String ipAddress, ServiceBuilder.OnResponseListener responseListener);
  }

  interface View extends PresentView<Presenter> {
  }

  interface Presenter extends IPresenter<View, Interactor> {
    void login(String userName);
  }
}