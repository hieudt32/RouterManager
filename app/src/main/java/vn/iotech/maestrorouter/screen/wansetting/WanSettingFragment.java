package vn.iotech.maestrorouter.screen.wansetting;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The WanSetting Fragment
 */
public class WanSettingFragment extends ViewFragment<WanSettingContract.Presenter> implements WanSettingContract.View {

  public static WanSettingFragment getInstance() {
    return new WanSettingFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_wan_setting;
  }
}
