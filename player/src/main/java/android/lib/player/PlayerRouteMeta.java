package android.lib.player;

import lishui.lib.router.table.RouteType;
import lishui.lib.router.table.RouterItem;
import lishui.lib.router.table.RouterMeta;
import lishui.lib.router.table.RouterTable;

/**
 * author : linlishui
 * time   : 2021/12/08
 * desc   : Player 路由元数据
 */
public class PlayerRouteMeta implements RouterMeta {

    @Override
    public RouterTable buildTable() {
        return new RouterTable.Builder()
                .addItem(new RouterItem("/player/exo", PlayerActivity.class, RouteType.ACTIVITY))
                .build();
    }
}
