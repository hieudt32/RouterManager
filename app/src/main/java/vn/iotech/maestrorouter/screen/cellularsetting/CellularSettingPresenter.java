package vn.iotech.maestrorouter.screen.cellularsetting;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The CellularSetting Presenter
 */
public class CellularSettingPresenter extends Presenter<CellularSettingContract.View, CellularSettingContract.Interactor>
        implements CellularSettingContract.Presenter {

  public CellularSettingPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public CellularSettingContract.View onCreateView() {
    return CellularSettingFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public CellularSettingContract.Interactor onCreateInteractor() {
    return new CellularSettingInteractor(this);
  }
}
