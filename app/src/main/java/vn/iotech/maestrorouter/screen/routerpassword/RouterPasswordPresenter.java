package vn.iotech.maestrorouter.screen.routerpassword;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The RouterPassword Presenter
 */
public class RouterPasswordPresenter extends Presenter<RouterPasswordContract.View, RouterPasswordContract.Interactor>
        implements RouterPasswordContract.Presenter {

  public RouterPasswordPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public RouterPasswordContract.View onCreateView() {
    return RouterPasswordFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public RouterPasswordContract.Interactor onCreateInteractor() {
    return new RouterPasswordInteractor(this);
  }
}
