package com.coolweather.app.util;

/**
 * Created by Administrator on 2017/9/25.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
