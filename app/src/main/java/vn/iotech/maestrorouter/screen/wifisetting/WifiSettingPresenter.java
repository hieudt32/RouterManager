package vn.iotech.maestrorouter.screen.wifisetting;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The WifiSetting Presenter
 */
public class WifiSettingPresenter extends Presenter<WifiSettingContract.View, WifiSettingContract.Interactor>
        implements WifiSettingContract.Presenter {

  public WifiSettingPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public WifiSettingContract.View onCreateView() {
    return WifiSettingFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public WifiSettingContract.Interactor onCreateInteractor() {
    return new WifiSettingInteractor(this);
  }
}
