# 高德地图

## 安装

```shell script
eeui plugin install https://github.com/aipaw/eeui-plugin-amap
```

## 卸载

```shell script
eeui plugin uninstall https://github.com/aipaw/eeui-plugin-amap
```

## 组件 eeui-amap 属性

| 属性 | 类型 | Demo | 描述 |
| --- | --- | --- | --- |
| sdkKey | object | {ios:'xxx',android: 'xxx'} | 指定开发者的 SDK 密匙 |
| scale | boolean | true | 设置比例尺功能是否可用 |
| center | array | [116.487, 40.00003] | 传入地理位置坐标[x,y] 默认为当前定位位置 |
| zoom | number | 合法值范围 [3,19] | 缩放级别 |
| compass | boolean | true | 是否允许显示指南针 |
| zoomEnable | boolean | true | 是否允许缩放 |
| marker | array | [`{position:[116,12]}]` | 点标记物的属性 |
| geolocation | boolean | true | 是否显示当前位置 |
| zoomPosition | String | center 或 bottom | 设置缩放按钮的位置 |
| gestures | String | ["zoom","rotate","tilt","scroll"] | 设置允许对地图做哪些手势操作 |
| myLocationEnabled | boolean | true | 定位按钮是否显示 |
| showMyLocation | boolean | true | 是否显示当前位置 |
| customEnabled | boolean | true | 是否开启自定义地图样式 |
| setMapCustomEnable | String | {"android":"/data/custom_map"} | 设置自定义地图资源文件的路径 |
| indoorswitch | boolean | false | 设置室内地图楼层切换控件是否可见 |

**建议你前往[高德开发者社区](http://lbs.amap.com/)申明你对应产品的Key，保证地图正常工作**

### 组件 eeui-amap 事件

**zoomchange** 用户缩放地图时触发该事件
事件格式

```
{
  "targetCoordinate" : "缩放后的位置",
  "zoom" : "目标可视区域的缩放级别。",
  "tilt" : "目标可视区域的倾斜度，以角度为单位。",
  "bearing" : "可视区域指向的方向，以角度为单位，从正北向逆时针方向计算，从0 度到360 度。",
  "isAbroad" : "该位置是否在国内（此属性不是精确计算，不能用于边界区域）",
  "scalePerPixel" : "Weex中一像素对应实际距离的长度（单位米）",
  "visibleRegion" : "可视区域的范围"
}
```

**dragend**
用户拖动地图时触发该事件

## 组件 eeui-amap-marker 属性

| 属性 | 类型 | Demo | 描述 |
| --- | --- | --- | --- |
| position | array | [116.487, 40.00003] | 传入地理位置坐标[x,y] 默认为当前定位位置 |
| icon | string | some_icon_url | 图标的url地址 |
| title | string | 'this is a marker' | 坐标点的名称 |
| hideCallout | boolean | true | 设置marker是否可点击 |
| open | boolean | true | 是否显示InfoWindow |

### 组件 eeui-amap-marker 事件

**click**
点击marker时触发

## 组件 eeui-amap-info-window 属性

| 属性 | 类型 | 描述 |
| --- | --- | --- |
| open | boolean | 是否显示InfoWindow |
| position | String | InfoWindow位置 |
| offset | String | InfoWindow偏移量 |

## 组件 eeui-amap-circle 属性

| 属性 | 类型 | 描述 |
| --- | --- | --- |
| center | String | 中心点 |
| strokeColor | String | 描边颜色 |
| fillColor | String | 填充颜色 |
| strokeWidth | float | 描边宽度 |
| radius | float | 半径 |

## 组件 eeui-amap-polygon 属性

| 属性 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 路径 |
| strokeColor | String | 描边颜色 |
| fillColor | String | 填充颜色 |
| strokeWidth | float | 描边宽度 |

## 组件 eeui-amap-polyline 属性

| 属性 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 路径 |
| strokeColor | String | 描边颜色 |
| strokeStyle | String | 描边样式，可为dashed或空 |
| strokeWidth | float | 描边宽度 |

## 模块引入

```
const amap = app.requireModule('eeui/amap');
```

##### getUserLocation(completeFunc,errorFunc)

* completeFunc 定位成功后的回调函数，返回的数据:

```
    { 
      data:{
        position: []
      },
      result: 'success' 
    }
```

##### amap.getLineDistance(posA, posB, callback)

*   获取两点间的直线距离

##### amap.polygonContainsMarker(position, id, callback)

*   判断点是否在合围范围内

一款高德地图插件，当前版本支持定位，缩放等地图常用操作。

## demo

```
<template>
    <div style="align-items: center">
        <eeui-amap style="width:750px;height:800px"
              :sdkKey="{ios:'5f30eead659fa7cd97a92865e560a18a','android':'232624b2ee61e42d5809616a08b6f5d5'}"
              :center="point.position"
              :zoom="15">
            <eeui-amap-marker :position="point.position" :title="point.title"></eeui-amap-marker>
        </eeui-amap>
    </div>
</template>
<script>
    export default{
        data(){
            return {
                point: {
                    position: [116.397721,39.904058],
                    title: 'This is a marker'
                },
            }
        },
    }
</script>

```
