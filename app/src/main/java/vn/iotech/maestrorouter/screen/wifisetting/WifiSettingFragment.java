package vn.iotech.maestrorouter.screen.wifisetting;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The WifiSetting Fragment
 */
public class WifiSettingFragment extends ViewFragment<WifiSettingContract.Presenter> implements WifiSettingContract.View {

  public static WifiSettingFragment getInstance() {
    return new WifiSettingFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_wifi_setting;
  }
}
