package vn.iotech.maestrorouter.screen.vpnstatus;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The VPNStatus Fragment
 */
public class VPNStatusFragment extends ViewFragment<VPNStatusContract.Presenter> implements VPNStatusContract.View {

  public static VPNStatusFragment getInstance() {
    return new VPNStatusFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_vpnstatus;
  }
}
