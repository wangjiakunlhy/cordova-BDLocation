# 基于百度定位SDK，Android 平台的cordova插件
**主要用于ionic hybrid APP中**
# 1.使用方法：

```
 cordova.plugins.BDDWplugin.getLocation(null,function (data) {
      alert(angular.toJson(data));//测试使用
      alert(data.address);//测试使用
    });

  data:定位成功后返回的定位相关数据，它是一个对象
	{
		"lat":,//纬度
		"lnt":,//经度
		"address":,//地址描述
		"cityName":,//所在城市名
		"distractName":,//坐在区/县级名称
		"allMessage":,//定位的调试打印值（开发人员使用）
	}
```
# 2.插件开发PPT
目录当中的：Android cordova插件开发过程 即是。