package vn.iotech.maestrorouter.screen.wansetting;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The WanSetting Presenter
 */
public class WanSettingPresenter extends Presenter<WanSettingContract.View, WanSettingContract.Interactor>
        implements WanSettingContract.Presenter {

  public WanSettingPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public WanSettingContract.View onCreateView() {
    return WanSettingFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public WanSettingContract.Interactor onCreateInteractor() {
    return new WanSettingInteractor(this);
  }
}
