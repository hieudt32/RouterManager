package vn.iotech.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;

import java.nio.ByteOrder;

import static android.content.Context.WIFI_SERVICE;

/**
 * NetworkUtils
 * Created by akai on 12/21/2017.
 */

public class NetworkUtils {

  public NetworkUtils() {

  }

  public static boolean isNetworkAvaiable(Activity activity) {
    ConnectivityManager connectivityMng = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = connectivityMng.getActiveNetworkInfo();
    // networkInfo will be null if no network is available
    return networkInfo != null && networkInfo.isConnected();
  }

  public static boolean is3GOn(Context context) {
    ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
    if (activeNetwork != null) { //connected internet
      if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
        return false;
      } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
        return true;
      }
    }
    return false;
  }

  public static String getGateway(Context context) {
    WifiManager wifiMgr = (WifiManager) context.getSystemService(WIFI_SERVICE);
    assert wifiMgr != null;
    @SuppressLint("MissingPermission") WifiInfo wifiInfo = wifiMgr.getConnectionInfo();
    int ipAddress = wifiInfo.getIpAddress();
    ipAddress = (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) ?
            Integer.reverseBytes(ipAddress) : ipAddress;
    return String.valueOf(ipAddress);
  }
}
