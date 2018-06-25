package com.huami.watch.volleytest;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * volley 网络请求框架的总结
 *
 */
public class VolleyUtils {


    /**
     * request get 请求的使用
     */
    private void getStringRequest(Context mContext , String url) {
        String testurl="http://api.k780.com:88/?app=phone.get&phone=13800138000&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
        RequestQueue queue= Volley.newRequestQueue(mContext);
        StringRequest request=new StringRequest(testurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("success",s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        queue.add(request);
    }


    /**
     *  post data to cloud 数据
     */

    private void postStringRequest(Context mContext) {
        String url="http://api.k780.com:88/?app=phone.get";
        RequestQueue queue=Volley.newRequestQueue(mContext);
        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("sucess",s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<>();
                map.put("phone","13800138000");
                map.put("appkey", "10003");
                map.put("sign", "b59bc3ef6191eb9f747dd4e83c99f2a4");
                map.put("format", "json");
                map.put("idcard", "110101199001011114");
                return map;
            }
        };
        queue.add(request);
    }

}
