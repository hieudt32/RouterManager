package vn.iotech.maestrorouter.screen.vpnstatus.vpnsetting;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The VPNSetting Fragment
 */
public class VPNSettingFragment extends ViewFragment<VPNSettingContract.Presenter> implements VPNSettingContract.View {

  public static VPNSettingFragment getInstance() {
    return new VPNSettingFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_vpnsetting;
  }
}
