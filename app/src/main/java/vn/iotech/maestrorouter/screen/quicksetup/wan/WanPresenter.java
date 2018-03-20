package vn.iotech.maestrorouter.screen.quicksetup.wan;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Wan Presenter
 */
public class WanPresenter extends Presenter<WanContract.View, WanContract.Interactor>
        implements WanContract.Presenter {

  public WanPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public WanContract.View onCreateView() {
    return WanFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public WanContract.Interactor onCreateInteractor() {
    return new WanInteractor(this);
  }
}
