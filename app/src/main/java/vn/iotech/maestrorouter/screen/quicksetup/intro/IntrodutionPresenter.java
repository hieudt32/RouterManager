package vn.iotech.maestrorouter.screen.quicksetup.intro;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Introdution Presenter
 */
public class IntrodutionPresenter extends Presenter<IntrodutionContract.View, IntrodutionContract.Interactor>
        implements IntrodutionContract.Presenter {

  public IntrodutionPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public IntrodutionContract.View onCreateView() {
    return IntrodutionFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public IntrodutionContract.Interactor onCreateInteractor() {
    return new IntrodutionInteractor(this);
  }
}
