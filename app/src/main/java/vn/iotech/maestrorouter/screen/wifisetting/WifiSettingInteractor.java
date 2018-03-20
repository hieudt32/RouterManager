package vn.iotech.maestrorouter.screen.wifisetting;

import vn.iotech.base.viper.Interactor;

/**
 * The WifiSetting interactor
 */
class WifiSettingInteractor extends Interactor<WifiSettingContract.Presenter>
        implements WifiSettingContract.Interactor {

  WifiSettingInteractor(WifiSettingContract.Presenter presenter) {
    super(presenter);
  }
}
