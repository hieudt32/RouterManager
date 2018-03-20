package vn.iotech.maestrorouter.screen.quicksetup.cellular;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The Cellular Presenter
 */
public class CellularPresenter extends Presenter<CellularContract.View, CellularContract.Interactor>
        implements CellularContract.Presenter {

  public CellularPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public CellularContract.View onCreateView() {
    return CellularFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public CellularContract.Interactor onCreateInteractor() {
    return new CellularInteractor(this);
  }
}
