package vn.iotech.maestrorouter.screen.cellularsetting;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The CellularSetting Fragment
 */
public class CellularSettingFragment extends ViewFragment<CellularSettingContract.Presenter> implements CellularSettingContract.View {

  public static CellularSettingFragment getInstance() {
    return new CellularSettingFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_cellular_setting;
  }
}
