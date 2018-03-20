package vn.iotech.maestrorouter.screen.quicksetup.wlan;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Wlan Presenter
 */
public class WlanPresenter extends Presenter<WlanContract.View, WlanContract.Interactor>
        implements WlanContract.Presenter {

  public WlanPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public WlanContract.View onCreateView() {
    return WlanFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public WlanContract.Interactor onCreateInteractor() {
    return new WlanInteractor(this);
  }
}
