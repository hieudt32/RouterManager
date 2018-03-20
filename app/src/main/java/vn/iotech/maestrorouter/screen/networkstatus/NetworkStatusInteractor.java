package vn.iotech.maestrorouter.screen.networkstatus;

import vn.iotech.base.viper.Interactor;

/**
 * The NetworkStatus interactor
 */
class NetworkStatusInteractor extends Interactor<NetworkStatusContract.Presenter>
        implements NetworkStatusContract.Interactor {

  NetworkStatusInteractor(NetworkStatusContract.Presenter presenter) {
    super(presenter);
  }
}
