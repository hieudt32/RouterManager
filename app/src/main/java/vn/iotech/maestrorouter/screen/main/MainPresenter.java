package vn.iotech.maestrorouter.screen.main;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Main Presenter
 */
public class MainPresenter extends Presenter<MainContract.View, MainContract.Interactor>
        implements MainContract.Presenter {

  public MainPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public MainContract.View onCreateView() {
    return MainFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public MainContract.Interactor onCreateInteractor() {
    return new MainInteractor(this);
  }
}
