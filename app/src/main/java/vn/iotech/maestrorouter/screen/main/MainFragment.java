package vn.iotech.maestrorouter.screen.main;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Main Fragment
 */
public class MainFragment extends ViewFragment<MainContract.Presenter> implements MainContract.View {

  public static MainFragment getInstance() {
    return new MainFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_main;
  }
}
