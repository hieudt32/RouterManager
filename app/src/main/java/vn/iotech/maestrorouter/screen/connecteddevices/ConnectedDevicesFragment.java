package vn.iotech.maestrorouter.screen.connecteddevices;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The ConnectedDevices Fragment
 */
public class ConnectedDevicesFragment extends ViewFragment<ConnectedDevicesContract.Presenter> implements ConnectedDevicesContract.View {

  public static ConnectedDevicesFragment getInstance() {
    return new ConnectedDevicesFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_connected_devices;
  }
}
