package com.wang;

import android.util.Log;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;

import org.apache.cordova.CallbackContext;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 作者：王家坤
 * 创建时间：2017/3/9 0009.
 */
public class MyLocationListener implements BDLocationListener {

    private CallbackContext context = null;
    private JSONObject obj = new JSONObject();


    public MyLocationListener(CallbackContext context) {
        this.context = context;
    }

    @Override
    public void onReceiveLocation(BDLocation location) {
        try {

            //获取定位结果
            StringBuffer sb = new StringBuffer(256);

            sb.append("time : ");
            sb.append(location.getTime());    //获取定位时间

            sb.append("\nerror code : ");
            sb.append(location.getLocType());    //获取类型类型

            sb.append("\nlatitude : ");
            sb.append(location.getLatitude());    //获取纬度信息
            obj.put("lat", location.getLatitude());

            sb.append("\nlontitude : ");
            sb.append(location.getLongitude());    //获取经度信息
            obj.put("lnt", location.getLongitude());

            sb.append("\nradius : ");
            sb.append(location.getRadius());    //获取定位精准度

            // 网络定位结果
            sb.append("\naddr : ");
            sb.append(location.getAddrStr());    //获取地址信息
            obj.put("address", location.getAddrStr());
            sb.append("\nCity : ");
            sb.append(location.getCity());    //获取城市地址信息
            obj.put("cityName", location.getCity());
            sb.append("\nxianji : ");
            sb.append(location.getDistrict());    //获取县级地址信息
            obj.put("distractName", location.getDistrict());
            Log.i("BaiduLocationApiDem", sb.toString());
            obj.put("allMessage", sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.context.success(obj);
    }

    @Override
    public void onConnectHotSpotMessage(String s, int i) {

    }
}
