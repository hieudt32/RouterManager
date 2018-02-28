package vn.iotech.maestrorouter.screen.login;

import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;
import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;
import vn.iotech.utils.StringUtils;

/**
 * The Login Fragment
 */
public class LoginFragment extends ViewFragment<LoginContract.Presenter> implements LoginContract.View {
  @BindView(R.id.user_name_et)
  EditText mUserNameEt;

  @OnClick(R.id.login_bt)
  void doLoginClick() {
    String userName = mUserNameEt.getText().toString();
    if (!StringUtils.isEmpty(userName)) {
      mPresenter.login(userName);
    }
  }

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
  }
}
