package vn.iotech.maestrorouter.screen.quicksetup.localnetwork;

import vn.iotech.base.viper.Interactor;

/**
 * The LocalNetwork interactor
 */
class LocalNetworkInteractor extends Interactor<LocalNetworkContract.Presenter>
        implements LocalNetworkContract.Interactor {

  LocalNetworkInteractor(LocalNetworkContract.Presenter presenter) {
    super(presenter);
  }
}
