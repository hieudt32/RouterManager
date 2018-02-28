package vn.iotech.maestrorouter.screen.splash;

import vn.iotech.base.viper.Interactor;

/**
 * The Splash interactor
 */
class SplashInteractor extends Interactor<SplashContract.Presenter>
        implements SplashContract.Interactor {

  SplashInteractor(SplashContract.Presenter presenter) {
    super(presenter);
  }
}
