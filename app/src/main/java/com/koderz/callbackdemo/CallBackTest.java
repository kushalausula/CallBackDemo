package com.koderz.callbackdemo;

import android.content.Context;

/**
 * Created by Pupa on 12/20/2016.
 */

public class CallBackTest {
    CallBack callBackinterface;

    CallBackTest(String data,Context mContext){

        callBackinterface=(CallBack)mContext;
        callBackinterface.callbackMethod(data);

//        if((mContext.toString().contains("Main2Activity")))
//        {
//            callBackinterface.callbackMethod(data,"1");
//        }else {
//            callBackinterface.callbackMethod(data);
//        }
    }
}
