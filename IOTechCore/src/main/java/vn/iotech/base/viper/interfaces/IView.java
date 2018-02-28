package vn.iotech.base.viper.interfaces;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import vn.iotech.base.BaseActivity;

/**
 * IView
 * Created by akai on 12/21/2017.
 */

public interface IView<P extends IPresenter> {

  void initLayout();

  BaseActivity getBaseActivity();

  Activity getViewContext();

  P getPresenter();

  void setPresenter(P presenter);

  void showProgress();

  void hideProgress();

}
