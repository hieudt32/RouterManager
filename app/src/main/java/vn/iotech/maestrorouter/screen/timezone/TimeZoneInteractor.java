package vn.iotech.maestrorouter.screen.timezone;

import vn.iotech.base.viper.Interactor;

/**
 * The TimeZone interactor
 */
class TimeZoneInteractor extends Interactor<TimeZoneContract.Presenter>
        implements TimeZoneContract.Interactor {

  TimeZoneInteractor(TimeZoneContract.Presenter presenter) {
    super(presenter);
  }
}
