package vn.iotech.maestrorouter.screen.spash;


import android.os.Handler;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;
import vn.iotech.maestrorouter.screen.login.LoginPresenter;
import vn.iotech.utils.ActivityUtils;
import vn.iotech.utils.NetworkUtils;


/**
 * The Splash Presenter
 */
public class SplashPresenter extends Presenter<SplashContract.View, SplashContract.Interactor>
        implements SplashContract.Presenter {

  public SplashPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public SplashContract.View onCreateView() {
    return SplashFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public SplashContract.Interactor onCreateInteractor() {
    return new SplashInteractor(this);
  }

  @Override
  public void goToLogin(int time) {
    if (NetworkUtils.isNetworkAvaiable(getViewContext())) {
      new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
          new LoginPresenter(mContainerView).pushView();
        }
      }, time);
    } else {
      mView.showDialog();
    }
  }
}
