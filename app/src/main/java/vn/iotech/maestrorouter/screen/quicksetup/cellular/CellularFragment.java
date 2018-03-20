package vn.iotech.maestrorouter.screen.quicksetup.cellular;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Cellular Fragment
 */
public class CellularFragment extends ViewFragment<CellularContract.Presenter> implements CellularContract.View {

  public static CellularFragment getInstance() {
    return new CellularFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_cellular;
  }
}
