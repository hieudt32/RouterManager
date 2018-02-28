package vn.iotech.maestrorouter.service;

import android.os.AsyncTask;

import vn.iotech.utils.StringUtils;
import vn.iotech.widget.DialogUtils;

/**
 * Created by akai on 2/28/2018.
 */

public class ServiceBuilder extends AsyncTask<String, Void, String> {

  private static ServiceBuilder sInstance;
  private OnResponseListener mOnResponseListener;
  private SSHManager mSshManager;

  public ServiceBuilder(SSHManager sshManager) {
    this.mSshManager = sshManager;
  }

  public ServiceBuilder setOnResponseListener(OnResponseListener mOnResponseListener) {
    this.mOnResponseListener = mOnResponseListener;
    return this;
  }

  public static ServiceBuilder getsInstance() {
    return sInstance;
  }

  public static void init(SSHManager mSshManager) {
    sInstance = new ServiceBuilder(mSshManager);
  }

  @Override
  protected String doInBackground(String... strings) {
    String error = mSshManager.connect();
    if (error == null) {
      if (strings != null && !strings[0].isEmpty()) {
        return mSshManager.sendCommand(strings[0]);
      } else {
        return "Successful";
      }
    } else {
      return null;
    }
  }

  @Override
  protected void onPostExecute(String result) {
    super.onPostExecute(result);
    if (mOnResponseListener != null) {
      if (!StringUtils.isEmpty(result)) {
        mOnResponseListener.onSuccess(result);
      } else {
        mOnResponseListener.onFail();
      }
      DialogUtils.dismissProgressDialog();
    }
  }

  public interface OnResponseListener {
    void onSuccess(String data);

    void onFail();
  }
}
