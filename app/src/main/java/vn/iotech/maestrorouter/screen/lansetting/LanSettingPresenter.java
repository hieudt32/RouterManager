package vn.iotech.maestrorouter.screen.lansetting;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The LanSetting Presenter
 */
public class LanSettingPresenter extends Presenter<LanSettingContract.View, LanSettingContract.Interactor>
        implements LanSettingContract.Presenter {

  public LanSettingPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public LanSettingContract.View onCreateView() {
    return LanSettingFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public LanSettingContract.Interactor onCreateInteractor() {
    return new LanSettingInteractor(this);
  }
}
