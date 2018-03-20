package vn.iotech.maestrorouter.screen.login;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;
import vn.iotech.maestrorouter.screen.main.MainPresenter;
import vn.iotech.utils.NetworkUtils;
import vn.iotech.utils.StringUtils;

/**
 * The Login Presenter
 */
public class LoginPresenter extends Presenter<LoginContract.View, LoginContract.Interactor>
        implements LoginContract.Presenter {
  private String ipAddress;

  public LoginPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public LoginContract.View onCreateView() {
    return LoginFragment.getInstance();
  }

  @Override
  public void start() {
    ipAddress = NetworkUtils.getGateway(getViewContext());
    ipAddress = StringUtils.isEmpty(ipAddress) ? "192.168.1.1" : ipAddress;
  }

  @Override
  public LoginContract.Interactor onCreateInteractor() {
    return new LoginInteractor(this);
  }

  @Override
  public void goToMainScreen() {
    new MainPresenter(mContainerView).presentView();
  }
}
