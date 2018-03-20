package vn.iotech.maestrorouter.screen.reboot;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Reboot Fragment
 */
public class RebootFragment extends ViewFragment<RebootContract.Presenter> implements RebootContract.View {

  public static RebootFragment getInstance() {
    return new RebootFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_reboot;
  }
}
