package vn.iotech.maestrorouter.screen.resetfactory;

import vn.iotech.base.viper.Interactor;

/**
 * The ResetFactory interactor
 */
class ResetFactoryInteractor extends Interactor<ResetFactoryContract.Presenter>
        implements ResetFactoryContract.Interactor {

  ResetFactoryInteractor(ResetFactoryContract.Presenter presenter) {
    super(presenter);
  }
}
