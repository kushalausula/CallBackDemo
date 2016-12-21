package com.koderz.callbackdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements CallBack{


    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mContext=this;

        CallBackTest callBackTest=new CallBackTest("data in main activity2",mContext);
    }


    @Override
    public void callbackMethod(String o) {
        Toast.makeText(this, "im in toast "+o, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void callbackMethod(String data, String id) {
        Toast.makeText(this, "im in toast "+data+" "+id, Toast.LENGTH_SHORT).show();

    }
}
