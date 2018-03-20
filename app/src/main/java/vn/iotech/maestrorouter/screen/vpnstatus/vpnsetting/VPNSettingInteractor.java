package vn.iotech.maestrorouter.screen.vpnstatus.vpnsetting;

import vn.iotech.base.viper.Interactor;

/**
 * The VPNSetting interactor
 */
class VPNSettingInteractor extends Interactor<VPNSettingContract.Presenter>
        implements VPNSettingContract.Interactor {

  VPNSettingInteractor(VPNSettingContract.Presenter presenter) {
    super(presenter);
  }
}
