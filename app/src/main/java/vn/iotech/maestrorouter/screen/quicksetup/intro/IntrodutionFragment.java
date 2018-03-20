package vn.iotech.maestrorouter.screen.quicksetup.intro;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Introdution Fragment
 */
public class IntrodutionFragment extends ViewFragment<IntrodutionContract.Presenter> implements IntrodutionContract.View {

  public static IntrodutionFragment getInstance() {
    return new IntrodutionFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_introdution;
  }
}
