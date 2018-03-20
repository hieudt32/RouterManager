package vn.iotech.maestrorouter.screen.quicksetup.wlan;

import vn.iotech.base.viper.Interactor;

/**
 * The Wlan interactor
 */
class WlanInteractor extends Interactor<WlanContract.Presenter>
        implements WlanContract.Interactor {

  WlanInteractor(WlanContract.Presenter presenter) {
    super(presenter);
  }
}
