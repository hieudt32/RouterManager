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

}
