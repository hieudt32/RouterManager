package vn.iotech.maestrorouter.screen.cellularsetting;

import vn.iotech.base.viper.Interactor;

/**
 * The CellularSetting interactor
 */
class CellularSettingInteractor extends Interactor<CellularSettingContract.Presenter>
        implements CellularSettingContract.Interactor {

  CellularSettingInteractor(CellularSettingContract.Presenter presenter) {
    super(presenter);
  }
}
