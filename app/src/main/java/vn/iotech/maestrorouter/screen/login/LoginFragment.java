package vn.iotech.maestrorouter.screen.login;

import android.os.Handler;
import android.widget.ImageView;

import butterknife.BindView;
import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;
import vn.iotech.widget.RippleBackground;

/**
 * The Login Fragment
 */
public class LoginFragment extends ViewFragment<LoginContract.Presenter> implements LoginContract.View {
  @BindView(R.id.login_iv)
  ImageView mLoginIv;
  @BindView(R.id.login_ripple)
  RippleBackground mRipple;

  public static LoginFragment getInstance() {
    return new LoginFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_login;
  }

  @Override
  public void initLayout() {
    super.initLayout();
    mRipple.startRippleAnimation();
    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        mRipple.stopRippleAnimation();
        mPresenter.goToMainScreen();
      }
    },4000);
  }
}
