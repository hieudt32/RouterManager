package vn.iotech.maestrorouter.screen.spash;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import vn.iotech.Default;
import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;
import vn.iotech.utils.ActivityUtils;
import vn.iotech.widget.DialogUtils;

/**
 * The Splash Fragment
 */
public class SplashFragment extends ViewFragment<SplashContract.Presenter> implements SplashContract.View {

  private static final int REQUEST_WRITE_EXTERNAL_STORAGE = 1001;
  private String[] PERMISSIONS = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

  public static SplashFragment getInstance() {
    return new SplashFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_splash;
  }

  @Override
  public void initLayout() {
    super.initLayout();
    requestPermission();
  }

  private void requestPermission() {
    int check = 0;
    for (int i = 0; i < PERMISSIONS.length; i++) {
      if (ContextCompat.checkSelfPermission(mPresenter.getViewContext(), PERMISSIONS[i]) != PackageManager.PERMISSION_GRANTED) {
        check++;
      }
    }
    if (check > 0) {
      ActivityCompat.requestPermissions(mPresenter.getViewContext(), PERMISSIONS, REQUEST_WRITE_EXTERNAL_STORAGE);
    } else {
      mPresenter.goToLogin(3);
    }
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == REQUEST_WRITE_EXTERNAL_STORAGE && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
      Log.d("App", "granted");
      mPresenter.goToLogin(3);
    } else {
      Log.d("App", "not granted");
      getActivity().finish();
    }
  }

  @Override
  public void showDialog() {
    ActivityUtils.goToSetting(getViewContext());

  }

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    mPresenter.start();
  }
}
