package vn.iotech.maestrorouter.screen.quicksetup.cellular;

import vn.iotech.base.viper.Interactor;

/**
 * The Cellular interactor
 */
class CellularInteractor extends Interactor<CellularContract.Presenter>
        implements CellularContract.Interactor {

  CellularInteractor(CellularContract.Presenter presenter) {
    super(presenter);
  }
}
