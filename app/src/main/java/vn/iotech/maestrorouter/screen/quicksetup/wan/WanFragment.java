package vn.iotech.maestrorouter.screen.quicksetup.wan;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Wan Fragment
 */
public class WanFragment extends ViewFragment<WanContract.Presenter> implements WanContract.View {

  public static WanFragment getInstance() {
    return new WanFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_wan;
  }
}
