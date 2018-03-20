package vn.iotech.maestrorouter.screen.reboot;

import vn.iotech.base.viper.Interactor;

/**
 * The Reboot interactor
 */
class RebootInteractor extends Interactor<RebootContract.Presenter>
        implements RebootContract.Interactor {

  RebootInteractor(RebootContract.Presenter presenter) {
    super(presenter);
  }
}
