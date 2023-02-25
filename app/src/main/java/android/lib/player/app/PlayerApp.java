package android.lib.player.app;

import android.app.Application;

import lishui.lib.router.core.Router;

/**
 * author : linlishui
 * time   : 2022/10/13
 */
public class PlayerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Router.init(this);
    }
}
