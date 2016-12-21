package com.koderz.callbackdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CallBack {


    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        Button btnTest= (Button) findViewById(R.id.test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallBackTest callBackTest=new CallBackTest("data in main activity",mContext);
            }
        });
    }

    @Override
    public void callbackMethod(String o) {

        Toast.makeText(this, "im in toast "+o, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void callbackMethod(String data, String id) {

    }
}
