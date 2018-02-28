package vn.iotech.maestrorouter.screen.dashbroad;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Dashbroad Fragment
 */
public class DashbroadFragment extends ViewFragment<DashbroadContract.Presenter> implements DashbroadContract.View {

  public static DashbroadFragment getInstance() {
    return new DashbroadFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_dashbroad;
  }
}
