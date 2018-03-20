package vn.iotech.maestrorouter.screen.quicksetup.wlan;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Wlan Fragment
 */
public class WlanFragment extends ViewFragment<WlanContract.Presenter> implements WlanContract.View {

  public static WlanFragment getInstance() {
    return new WlanFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_wlan;
  }
}
