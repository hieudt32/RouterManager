package vn.iotech.maestrorouter.screen.routerinformation;

import vn.iotech.base.viper.Interactor;

/**
 * The RouterInformation interactor
 */
class RouterInformationInteractor extends Interactor<RouterInformationContract.Presenter>
        implements RouterInformationContract.Interactor {

  RouterInformationInteractor(RouterInformationContract.Presenter presenter) {
    super(presenter);
  }
}
