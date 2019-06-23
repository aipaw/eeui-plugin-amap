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
            WXSDKEngine.registerComponent("amap-circle", WXMapCircleComponent.class);
            WXSDKEngine.registerComponent("amap-info-window", WXMapInfoWindowComponent.class);
            WXSDKEngine.registerComponent("amap-marker", WXMapMarkerComponent.class);
            WXSDKEngine.registerComponent("amap-polygon", WXMapPolygonComponent.class);
            WXSDKEngine.registerComponent("amap-polyline", WXMapPolyLineComponent.class);
            WXSDKEngine.registerComponent("amap", WXMapViewComponent.class);
            WXSDKEngine.registerModule("amap", WXMapModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
