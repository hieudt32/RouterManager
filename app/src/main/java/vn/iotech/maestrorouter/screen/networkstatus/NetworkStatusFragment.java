package vn.iotech.maestrorouter.screen.networkstatus;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The NetworkStatus Fragment
 */
public class NetworkStatusFragment extends ViewFragment<NetworkStatusContract.Presenter> implements NetworkStatusContract.View {

  public static NetworkStatusFragment getInstance() {
    return new NetworkStatusFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_network_status;
  }
}
