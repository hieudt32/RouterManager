package vn.iotech.maestrorouter.screen.lansetting;

import vn.iotech.base.viper.Interactor;

/**
 * The LanSetting interactor
 */
class LanSettingInteractor extends Interactor<LanSettingContract.Presenter>
        implements LanSettingContract.Interactor {

  LanSettingInteractor(LanSettingContract.Presenter presenter) {
    super(presenter);
  }
}
