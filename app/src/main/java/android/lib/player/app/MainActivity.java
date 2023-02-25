package android.lib.player.app;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import lishui.lib.router.core.Router;
import android.lib.player.util.IntentUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Router.getInstance()
                .build("/player/exo")
                .withAction(IntentUtil.ACTION_VIEW)
                .withUri(Uri.parse("http://vd2.bdstatic.com/mda-mjschdpa9hqhq6em/360p/h264/1635327570700379837/mda-mjschdpa9hqhq6em.mp4"))
                .navigation();
        finish();
    }
}