package vn.iotech.maestrorouter.screen.routerpassword;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The RouterPassword Fragment
 */
public class RouterPasswordFragment extends ViewFragment<RouterPasswordContract.Presenter> implements RouterPasswordContract.View {

  public static RouterPasswordFragment getInstance() {
    return new RouterPasswordFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_router_password;
  }
}
