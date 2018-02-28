package vn.iotech.maestrorouter;

import android.os.Bundle;

import vn.iotech.base.ContainerActivity;
import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.screen.spash.SplashPresenter;

public class MainActivity extends ContainerActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public ViewFragment onCreateFirstFragment() {
    return (ViewFragment) new SplashPresenter(this).getFragment();
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();

  }
}
