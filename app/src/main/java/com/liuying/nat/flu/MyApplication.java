package com.liuying.nat.flu;

import android.app.Application;
import io.flutter.view.FlutterMain;

/**
 * Created by liuying on 2020-01-14 13:13.
 * Email: ly1203575492@163.com
 */
public class MyApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    FlutterMain.startInitialization(this);
  }
}
