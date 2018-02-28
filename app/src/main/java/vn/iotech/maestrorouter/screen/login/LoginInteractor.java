package vn.iotech.maestrorouter.screen.login;

import vn.iotech.base.viper.Interactor;
import vn.iotech.maestrorouter.service.SSHManager;
import vn.iotech.maestrorouter.service.ServiceBuilder;

/**
 * The Login interactor
 */
class LoginInteractor extends Interactor<LoginContract.Presenter>
        implements LoginContract.Interactor {

  LoginInteractor(LoginContract.Presenter presenter) {
    super(presenter);
  }

  @Override
  public void login(String userName, String ipAddress, ServiceBuilder.OnResponseListener responseListener) {
    SSHManager sshManager = new SSHManager(userName, "", ipAddress, "", mPresenter.getViewContext());
    new ServiceBuilder(sshManager).setOnResponseListener(responseListener).execute("");
  }
}
