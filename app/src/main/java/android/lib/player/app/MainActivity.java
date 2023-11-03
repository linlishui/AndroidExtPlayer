package android.lib.player.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.lib.player.PlayerActivity;
import android.lib.player.util.IntentUtil;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Router.getInstance()
//                .build("/player/exo")
//                .withAction(IntentUtil.ACTION_VIEW)
//                .withUri(Uri.parse("http://vd2.bdstatic.com/mda-mjschdpa9hqhq6em/360p/h264/1635327570700379837/mda-mjschdpa9hqhq6em.mp4"))
//                .navigation();

        List<String> urlList = new ArrayList<>();
        urlList.add("http://vd2.bdstatic.com/mda-mjschdpa9hqhq6em/360p/h264/1635327570700379837/mda-mjschdpa9hqhq6em.mp4");
        urlList.add("http://vd2.bdstatic.com/mda-mjschdpa9hqhq6em/360p/h264/1635327570700379837/mda-mjschdpa9hqhq6em.mp4");
        String url = "http://vd2.bdstatic.com/mda-mjschdpa9hqhq6em/360p/h264/1635327570700379837/mda-mjschdpa9hqhq6em.mp4";

        start(MainActivity.this, url);
        finish();
    }

    public static void start(Context context, String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        Intent intent = new Intent(context, PlayerActivity.class);
        intent.setAction(IntentUtil.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        if (!(context instanceof Activity)) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        context.startActivity(intent);
    }

    public static void start(Context context, List<String> urlList) {
        if (urlList == null || urlList.isEmpty()) {
            return;
        }
        Intent intent = new Intent(context, PlayerActivity.class);
        intent.setAction(IntentUtil.ACTION_VIEW_LIST);
        for (int index = 0; index < urlList.size(); index++) {
            String extraUrl = IntentUtil.URI_EXTRA + "_" + index;
            intent.putExtra(extraUrl, urlList.get(index));
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        context.startActivity(intent);
    }
}