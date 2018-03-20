package vn.iotech.maestrorouter.screen.vpnstatus;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The VPNStatus Presenter
 */
public class VPNStatusPresenter extends Presenter<VPNStatusContract.View, VPNStatusContract.Interactor>
        implements VPNStatusContract.Presenter {

  public VPNStatusPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public VPNStatusContract.View onCreateView() {
    return VPNStatusFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public VPNStatusContract.Interactor onCreateInteractor() {
    return new VPNStatusInteractor(this);
  }
}
