package vn.iotech.maestrorouter.screen.wansetting;

import vn.iotech.base.viper.Interactor;

/**
 * The WanSetting interactor
 */
class WanSettingInteractor extends Interactor<WanSettingContract.Presenter>
        implements WanSettingContract.Interactor {

  WanSettingInteractor(WanSettingContract.Presenter presenter) {
    super(presenter);
  }
}
