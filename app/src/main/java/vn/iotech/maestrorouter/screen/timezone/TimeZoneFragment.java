package vn.iotech.maestrorouter.screen.timezone;

import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The TimeZone Fragment
 */
public class TimeZoneFragment extends ViewFragment<TimeZoneContract.Presenter> implements TimeZoneContract.View {

  public static TimeZoneFragment getInstance() {
    return new TimeZoneFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_time_zone;
  }
}
