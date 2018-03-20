package vn.iotech.maestrorouter.screen.routerinformation;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The RouterInformation Fragment
 */
public class RouterInformationFragment extends ViewFragment<RouterInformationContract.Presenter> implements RouterInformationContract.View {

  public static RouterInformationFragment getInstance() {
    return new RouterInformationFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_router_information;
  }
}
