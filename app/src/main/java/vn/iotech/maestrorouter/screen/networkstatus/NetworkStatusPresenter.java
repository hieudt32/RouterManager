package vn.iotech.maestrorouter.screen.networkstatus;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The NetworkStatus Presenter
 */
public class NetworkStatusPresenter extends Presenter<NetworkStatusContract.View, NetworkStatusContract.Interactor>
        implements NetworkStatusContract.Presenter {

  public NetworkStatusPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public NetworkStatusContract.View onCreateView() {
    return NetworkStatusFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public NetworkStatusContract.Interactor onCreateInteractor() {
    return new NetworkStatusInteractor(this);
  }
}
