package com.dkhs.baseknowledge;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/3/14.
 */
public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Log.e("xue", "SecondActivity>>>onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("xue", "SecondActivity>>>onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("xue", "SecondActivity>>>onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("xue", "SecondActivity>>>onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("xue", "SecondActivity>>>onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("xue", "SecondActivity>>>onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("xue", "SecondActivity>>>onRestart");
    }
}
