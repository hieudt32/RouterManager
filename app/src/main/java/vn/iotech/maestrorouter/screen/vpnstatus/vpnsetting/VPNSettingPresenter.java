package vn.iotech.maestrorouter.screen.vpnstatus.vpnsetting;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The VPNSetting Presenter
 */
public class VPNSettingPresenter extends Presenter<VPNSettingContract.View, VPNSettingContract.Interactor>
        implements VPNSettingContract.Presenter {

  public VPNSettingPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public VPNSettingContract.View onCreateView() {
    return VPNSettingFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public VPNSettingContract.Interactor onCreateInteractor() {
    return new VPNSettingInteractor(this);
  }
}
