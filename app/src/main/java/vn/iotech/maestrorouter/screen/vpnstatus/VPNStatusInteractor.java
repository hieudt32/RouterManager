package vn.iotech.maestrorouter.screen.vpnstatus;

import vn.iotech.base.viper.Interactor;

/**
 * The VPNStatus interactor
 */
class VPNStatusInteractor extends Interactor<VPNStatusContract.Presenter>
        implements VPNStatusContract.Interactor {

  VPNStatusInteractor(VPNStatusContract.Presenter presenter) {
    super(presenter);
  }
}
