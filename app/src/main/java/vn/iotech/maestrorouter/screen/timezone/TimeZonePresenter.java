package vn.iotech.maestrorouter.screen.timezone;

import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.interfaces.ContainerView;

/**
 * The TimeZone Presenter
 */
public class TimeZonePresenter extends Presenter<TimeZoneContract.View, TimeZoneContract.Interactor>
        implements TimeZoneContract.Presenter {

  public TimeZonePresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public TimeZoneContract.View onCreateView() {
    return TimeZoneFragment.getInstance();
  }

  @Override
  public void start() {
    // Getting data here
  }

  @Override
  public TimeZoneContract.Interactor onCreateInteractor() {
    return new TimeZoneInteractor(this);
  }
}
