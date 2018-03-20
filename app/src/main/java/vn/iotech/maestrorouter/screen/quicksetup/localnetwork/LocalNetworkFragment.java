package vn.iotech.maestrorouter.screen.quicksetup.localnetwork;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The LocalNetwork Fragment
 */
public class LocalNetworkFragment extends ViewFragment<LocalNetworkContract.Presenter> implements LocalNetworkContract.View {

  public static LocalNetworkFragment getInstance() {
    return new LocalNetworkFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_local_network;
  }
}
