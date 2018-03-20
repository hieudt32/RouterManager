package vn.iotech.maestrorouter.screen.quicksetup.intro;

import vn.iotech.base.viper.Interactor;

/**
 * The Introdution interactor
 */
class IntrodutionInteractor extends Interactor<IntrodutionContract.Presenter>
        implements IntrodutionContract.Interactor {

  IntrodutionInteractor(IntrodutionContract.Presenter presenter) {
    super(presenter);
  }
}
