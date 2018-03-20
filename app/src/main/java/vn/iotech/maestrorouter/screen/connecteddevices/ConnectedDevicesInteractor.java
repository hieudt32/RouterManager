package vn.iotech.maestrorouter.screen.connecteddevices;

import vn.iotech.base.viper.Interactor;

/**
 * The ConnectedDevices interactor
 */
class ConnectedDevicesInteractor extends Interactor<ConnectedDevicesContract.Presenter>
        implements ConnectedDevicesContract.Interactor {

  ConnectedDevicesInteractor(ConnectedDevicesContract.Presenter presenter) {
    super(presenter);
  }
}
