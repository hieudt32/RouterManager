package vn.iotech.base.viper;

import vn.iotech.base.viper.interfaces.IInteractor;
import vn.iotech.base.viper.interfaces.IPresenter;

/**
 * Interactor
 * Created by akai on 12/22/2017.
 */

public abstract class Interactor<P extends IPresenter> implements IInteractor<P> {
  protected P mPresenter;

  public Interactor(P presenter) {
    mPresenter = presenter;
  }

  public P getPresenter() {
    return mPresenter;
  }
}
