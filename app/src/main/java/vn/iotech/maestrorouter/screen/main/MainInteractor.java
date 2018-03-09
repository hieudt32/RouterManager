package vn.iotech.maestrorouter.screen.main;

import vn.iotech.base.viper.Interactor;

/**
 * The Main interactor
 */
class MainInteractor extends Interactor<MainContract.Presenter>
        implements MainContract.Interactor {

  MainInteractor(MainContract.Presenter presenter) {
    super(presenter);
  }
}
