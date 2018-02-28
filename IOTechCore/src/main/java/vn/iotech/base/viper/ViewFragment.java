package vn.iotech.base.viper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.iotech.base.BaseActivity;
import vn.iotech.base.BaseFragment;
import vn.iotech.base.viper.interfaces.IPresenter;
import vn.iotech.base.viper.interfaces.PresentView;
import vn.iotech.utils.ContextUtils;
import vn.iotech.utils.NetworkUtils;

/**
 * ViewFragment
 * Created by akai on 12/22/2017.
 */

public abstract class ViewFragment<P extends IPresenter>
        extends BaseFragment implements PresentView<P> {

  protected P mPresenter;
  protected boolean mIsInitialized = false;
  private boolean mViewHidden;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (mPresenter == null) {
      Intent i = getActivity().getBaseContext().getPackageManager()
              .getLaunchIntentForPackage(getActivity().getBaseContext().getPackageName());
      i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
      startActivity(i);
      return;
    }
    mPresenter.registerEventBus();
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    mPresenter.unregisterEventBus();
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    if (!mIsInitialized) {
      mRootView = super.onCreateView(inflater, container, savedInstanceState);

      // Prepare layout
      if (getArguments() != null) {
        parseArgs(getArguments());
      }

      initLayout();

      mIsInitialized = true;
    }

    return mRootView;
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (!mStartOnAnimationEnded && !mIsStarted) {
      startPresent();
    }
  }

  @Override
  protected void startPresent() {
    if (mPresenter == null) {
      Intent i = getActivity().getBaseContext().getPackageManager()
              .getLaunchIntentForPackage(getActivity().getBaseContext().getPackageName());
      i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
      startActivity(i);
      return;
    }

    mPresenter.start();
    mIsStarted = true;
  }

  @Override
  public void showProgress() {
    if (ContextUtils.isValidContext(getBaseActivity())) {
      getBaseActivity().showProgress();
    }
  }

  @Override
  public void hideProgress() {
    if (ContextUtils.isValidContext(getBaseActivity())) {
      getBaseActivity().hideProgress();
    }
  }

  @Override
  public void initLayout() {
    // Override this method when need to preview some views, layouts
  }

  @Override
  public void showAlertDialog(String message) {
    if (ContextUtils.isValidContext(getBaseActivity())) {
      getBaseActivity().showAlertDialog(message);
    }
  }

  @Override
  public BaseActivity getBaseActivity() {
    if (getActivity() instanceof BaseActivity) {
      return (BaseActivity) getActivity();
    } else {
      return null;
    }
  }

  @Override
  public void onRequestError(String errorCode, String errorMessage) {
    if (ContextUtils.isValidContext(getBaseActivity())) {
      getBaseActivity().onRequestError(errorCode, errorMessage);
    }
  }

  @Override
  public void onNetworkError(boolean shouldShowPopup) {
    if (!NetworkUtils.isNetworkAvaiable(getActivity()) && shouldShowPopup) {
      getBaseActivity().showNetworkErrorDialog(getActivity());
    }
  }

  @Override
  public void onRequestSuccess() {
    if (ContextUtils.isValidContext(getBaseActivity())) {
      getBaseActivity().onRequestSuccess();
    }
  }

  @Override
  public Activity getViewContext() {
    return getActivity();
  }

  @Override
  public void setPresenter(P presenter) {
    mPresenter = presenter;
  }

  @Override
  public P getPresenter() {
    return mPresenter;
  }

  /**
   * Parse Arguments that sent to this fragment
   * Override if needed
   *
   * @param args sent to this fragment
   */
  protected void parseArgs(Bundle args) {
  }

  @Override
  protected boolean needTranslationAnimation() {
    return true;
  }

  @Override
  public void onDisplay() {
    super.onDisplay();
    mPresenter.onFragmentDisplay();
  }

  @Override
  public void onHiddenChanged(boolean hidden) {
    super.onHiddenChanged(hidden);
    mViewHidden = hidden;
  }

  @Override
  public boolean isViewHidden() {
    return mViewHidden;
  }

  @Override
  public boolean isShown() {
    return isResumed() && this == BaseActivity.getTopFragment(getFragmentManager());
  }
}
