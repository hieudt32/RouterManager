package vn.iotech.maestrorouter.screen.login;

import android.util.Log;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;
import vn.iotech.maestrorouter.service.SSHManager;
import vn.iotech.maestrorouter.service.ServiceBuilder;
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
    ipAddress = StringUtils.isEmpty(NetworkUtils.getGateway(getViewContext())) ? "192.168.1.1" : ipAddress;
  }

  @Override
  public LoginContract.Interactor onCreateInteractor() {
    return new LoginInteractor(this);
  }

  @Override
  public void login(final String userName) {
    mView.showProgress();
    mInteractor.login(userName, ipAddress, new ServiceBuilder.OnResponseListener() {
      @Override
      public void onSuccess(String data) {
        Log.d(LoginPresenter.class.getName(), data);
        SSHManager.init(userName, "", ipAddress, "", getViewContext());
        ServiceBuilder.init(SSHManager.getInstance());
      }

      @Override
      public void onFail() {
        Log.d(LoginPresenter.class.getName(), "fail");
      }
    });
  }
}
