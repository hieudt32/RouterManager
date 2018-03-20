package vn.iotech.maestrorouter.screen.resetfactory;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The ResetFactory Presenter
 */
public class ResetFactoryPresenter extends Presenter<ResetFactoryContract.View, ResetFactoryContract.Interactor>
        implements ResetFactoryContract.Presenter {

  public ResetFactoryPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public ResetFactoryContract.View onCreateView() {
    return ResetFactoryFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public ResetFactoryContract.Interactor onCreateInteractor() {
    return new ResetFactoryInteractor(this);
  }
}
