package vn.iotech.maestrorouter.screen.dashbroad;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Dashbroad Presenter
 */
public class DashbroadPresenter extends Presenter<DashbroadContract.View, DashbroadContract.Interactor>
        implements DashbroadContract.Presenter {

  public DashbroadPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public DashbroadContract.View onCreateView() {
    return DashbroadFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public DashbroadContract.Interactor onCreateInteractor() {
    return new DashbroadInteractor(this);
  }
}
