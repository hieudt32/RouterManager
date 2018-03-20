package vn.iotech.maestrorouter.service;

import android.os.AsyncTask;

/**
 * ServiceBuilder
 * Created by akai on 2/28/2018.
 */

public class ServiceBuilder extends AsyncTask<String, Void, String> {

  private static ServiceBuilder sInstance;
  private OnResponseListener mOnResponseListener;
  private SSHManager mSshManager;
  private RequestType mRequestType;

  public ServiceBuilder(SSHManager sshManager) {
    this.mSshManager = sshManager;
  }

  public ServiceBuilder setOnResponseListener(OnResponseListener mOnResponseListener) {
    this.mOnResponseListener = mOnResponseListener;
    return this;
  }

  public void setRequestType(RequestType mRequestType) {
    this.mRequestType = mRequestType;
  }

  public static ServiceBuilder getsInstance() {
    return sInstance;
  }

  public static void init(SSHManager mSshManager) {
    sInstance = new ServiceBuilder(mSshManager);
  }

  @Override
  protected String doInBackground(String... strings) {
    String response = null;
    if (mRequestType == RequestType.Connect) {
      String error = mSshManager.connect();
      if (error == null) {
        response = ResponseCode.CONNECTED;
      } else {
        response = error;
      }
    } else {
      if (!mSshManager.isConnect()) {
        String error = mSshManager.connect();
        if (error == null) {
          if (strings != null && !strings[0].isEmpty()) {
            response = mSshManager.sendCommand(strings[0]);
          }
        } else {
          if (mRequestType == RequestType.Getting) {
            response = ResponseCode.CONNECT_FAIL + error;
          } else {
            response = error;
          }
        }
      } else {
        if (strings != null && !strings[0].isEmpty()) {
          response = mSshManager.sendCommand(strings[0]);
        }
      }
    }
    return response;
  }

  @Override
  protected void onPostExecute(String result) {
    super.onPostExecute(result);
    if (mOnResponseListener != null) {
      if (mRequestType == RequestType.Connect) {
        if (result.contains(ResponseCode.CONNECTED)) {
          mOnResponseListener.onSuccess(result);
        } else {
          mOnResponseListener.onFail(result);
        }
      } else if (mRequestType == RequestType.Setting) {
        if (result == null) {
          mOnResponseListener.onSuccess(ResponseCode.SETTING_SUCCESS);
        } else {
          mOnResponseListener.onFail(result);
        }
      } else {
        if (result == null) {
          mOnResponseListener.onFail(ResponseCode.GETTING_FAIL);
        } else {
          if (result.contains(ResponseCode.CONNECT_FAIL)) {
            mOnResponseListener.onFail(result);
          } else {
            mOnResponseListener.onSuccess(result);
          }
        }
      }

    }
  }

  public interface OnResponseListener {
    void onSuccess(String data);

    void onFail(String fail);
  }
}
