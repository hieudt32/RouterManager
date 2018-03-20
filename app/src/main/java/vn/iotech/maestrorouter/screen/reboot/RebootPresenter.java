package vn.iotech.maestrorouter.screen.reboot;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Reboot Presenter
 */
public class RebootPresenter extends Presenter<RebootContract.View, RebootContract.Interactor>
        implements RebootContract.Presenter {

  public RebootPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public RebootContract.View onCreateView() {
    return RebootFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public RebootContract.Interactor onCreateInteractor() {
    return new RebootInteractor(this);
  }
}
