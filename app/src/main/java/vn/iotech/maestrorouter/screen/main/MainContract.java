package vn.iotech.maestrorouter.screen.main;

import vn.iotech.base.viper.interfaces.IInteractor;
import vn.iotech.base.viper.interfaces.IPresenter;
import vn.iotech.base.viper.interfaces.PresentView;

/**
 * The Main Contract
 */
interface MainContract {

  interface Interactor extends IInteractor<Presenter> {
  }

  interface View extends PresentView<Presenter> {
  }

  interface Presenter extends IPresenter<View, Interactor> {
    vn.iotech.base.viper.Presenter getTab(int tabId);

    void goToQuickSetup();

    String getTitle(int tabId);
  }
}