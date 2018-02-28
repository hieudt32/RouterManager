package vn.iotech.maestrorouter.screen.dashbroad;

import vn.iotech.base.viper.Interactor;

/**
 * The Dashbroad interactor
 */
class DashbroadInteractor extends Interactor<DashbroadContract.Presenter>
        implements DashbroadContract.Interactor {

  DashbroadInteractor(DashbroadContract.Presenter presenter) {
    super(presenter);
  }
}
