package vn.iotech.maestrorouter.screen.lansetting;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The LanSetting Fragment
 */
public class LanSettingFragment extends ViewFragment<LanSettingContract.Presenter> implements LanSettingContract.View {

  public static LanSettingFragment getInstance() {
    return new LanSettingFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_lan_setting;
  }
}
