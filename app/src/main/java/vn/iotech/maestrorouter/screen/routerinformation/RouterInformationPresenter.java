package vn.iotech.maestrorouter.screen.routerinformation;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The RouterInformation Presenter
 */
public class RouterInformationPresenter extends Presenter<RouterInformationContract.View, RouterInformationContract.Interactor>
        implements RouterInformationContract.Presenter {

  public RouterInformationPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public RouterInformationContract.View onCreateView() {
    return RouterInformationFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public RouterInformationContract.Interactor onCreateInteractor() {
    return new RouterInformationInteractor(this);
  }
}
