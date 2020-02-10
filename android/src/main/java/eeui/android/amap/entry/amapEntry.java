package eeui.android.amap.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eeui.framework.extend.annotation.ModuleEntry;
import eeui.android.amap.component.WXMapCircleComponent;
import eeui.android.amap.component.WXMapInfoWindowComponent;
import eeui.android.amap.component.WXMapMarkerComponent;
import eeui.android.amap.component.WXMapPolyLineComponent;
import eeui.android.amap.component.WXMapPolygonComponent;
import eeui.android.amap.component.WXMapViewComponent;
import eeui.android.amap.module.WXMapModule;

@ModuleEntry
public class amapEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //1、注册weex模块
        try {
            WXSDKEngine.registerComponent("eeui-amap-circle", WXMapCircleComponent.class);
            WXSDKEngine.registerComponent("eeui-amap-info-window", WXMapInfoWindowComponent.class);
            WXSDKEngine.registerComponent("eeui-amap-marker", WXMapMarkerComponent.class);
            WXSDKEngine.registerComponent("eeui-amap-polygon", WXMapPolygonComponent.class);
            WXSDKEngine.registerComponent("eeui-amap-polyline", WXMapPolyLineComponent.class);
            WXSDKEngine.registerComponent("eeui-amap", WXMapViewComponent.class);
            WXSDKEngine.registerModule("eeuiAmap", WXMapModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
