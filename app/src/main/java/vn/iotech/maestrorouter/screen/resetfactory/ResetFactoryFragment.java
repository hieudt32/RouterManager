package vn.iotech.maestrorouter.screen.resetfactory;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The ResetFactory Fragment
 */
public class ResetFactoryFragment extends ViewFragment<ResetFactoryContract.Presenter> implements ResetFactoryContract.View {

  public static ResetFactoryFragment getInstance() {
    return new ResetFactoryFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_reset_factory;
  }
}
