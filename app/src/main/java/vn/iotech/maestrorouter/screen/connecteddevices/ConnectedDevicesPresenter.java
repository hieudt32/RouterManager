package vn.iotech.maestrorouter.screen.connecteddevices;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The ConnectedDevices Presenter
 */
public class ConnectedDevicesPresenter extends Presenter<ConnectedDevicesContract.View, ConnectedDevicesContract.Interactor>
        implements ConnectedDevicesContract.Presenter {

  public ConnectedDevicesPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public ConnectedDevicesContract.View onCreateView() {
    return ConnectedDevicesFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public ConnectedDevicesContract.Interactor onCreateInteractor() {
    return new ConnectedDevicesInteractor(this);
  }
}
