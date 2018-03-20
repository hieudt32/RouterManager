package vn.iotech.maestrorouter;

/**
 * Application
 * Created by akai on 2/28/2018.
 */

public class Application extends android.app.Application {

    private static Application instance;

    @Override
    public void onCreate() {
      super.onCreate();
      instance = this;
    }

  public static Application getInstance() {
    return instance;
  }
}
