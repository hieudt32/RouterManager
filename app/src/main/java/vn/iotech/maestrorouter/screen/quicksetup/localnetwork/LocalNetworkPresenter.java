package vn.iotech.maestrorouter.screen.quicksetup.localnetwork;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The LocalNetwork Presenter
 */
public class LocalNetworkPresenter extends Presenter<LocalNetworkContract.View, LocalNetworkContract.Interactor>
        implements LocalNetworkContract.Presenter {

  public LocalNetworkPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public LocalNetworkContract.View onCreateView() {
    return LocalNetworkFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public LocalNetworkContract.Interactor onCreateInteractor() {
    return new LocalNetworkInteractor(this);
  }
}
