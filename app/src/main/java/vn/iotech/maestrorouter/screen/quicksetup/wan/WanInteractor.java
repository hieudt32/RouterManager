package vn.iotech.maestrorouter.screen.quicksetup.wan;

import vn.iotech.base.viper.Interactor;

/**
 * The Wan interactor
 */
class WanInteractor extends Interactor<WanContract.Presenter>
        implements WanContract.Interactor {

  WanInteractor(WanContract.Presenter presenter) {
    super(presenter);
  }
}
