package vn.iotech.maestrorouter.screen.main;

import android.app.Activity;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;
import vn.iotech.maestrorouter.R;
import vn.iotech.maestrorouter.screen.connecteddevices.ConnectedDevicesPresenter;
import vn.iotech.maestrorouter.screen.dashbroad.DashbroadPresenter;
import vn.iotech.maestrorouter.screen.quicksetup.intro.IntrodutionPresenter;

/**
 * The Main Presenter
 */
public class MainPresenter extends Presenter<MainContract.View, MainContract.Interactor>
        implements MainContract.Presenter {

  public MainPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public MainContract.View onCreateView() {
    return MainFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public MainContract.Interactor onCreateInteractor() {
    return new MainInteractor(this);
  }

  @Override
  public Presenter getTab(int tabId) {
    Presenter presenter = null;
    switch (tabId) {
      case R.id.nav_dashboard:
        presenter = new DashbroadPresenter(mContainerView);
        break;
      case R.id.nav_connected_device:
        presenter = new ConnectedDevicesPresenter(mContainerView);
        break;
    }
    return presenter;
  }

  @Override
  public void goToQuickSetup() {
    new IntrodutionPresenter(mContainerView).pushView();
  }

  @Override
  public String getTitle(int tabId) {
    String title = getViewContext().getString(R.string.dashboard);
    switch (tabId) {
      case R.id.nav_dashboard:
        title = getViewContext().getString(R.string.dashboard);
        break;
      case R.id.nav_connected_device:
        title = getViewContext().getString(R.string.connected_device);
        break;
    }
    return title;
  }
}
