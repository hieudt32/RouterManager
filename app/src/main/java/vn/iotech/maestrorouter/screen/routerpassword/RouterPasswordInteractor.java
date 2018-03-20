package vn.iotech.maestrorouter.screen.routerpassword;

import vn.iotech.base.viper.Interactor;

/**
 * The RouterPassword interactor
 */
class RouterPasswordInteractor extends Interactor<RouterPasswordContract.Presenter>
        implements RouterPasswordContract.Interactor {

  RouterPasswordInteractor(RouterPasswordContract.Presenter presenter) {
    super(presenter);
  }
}
