package com.dkhs.baseknowledge;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ProgressDialog dialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("xue", "MainActivity>>>onCreate");
        dialog = new ProgressDialog(this);
        dialog.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("xue", "MainActivity>>>onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("xue", "MainActivity>>>onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("xue", "MainActivity>>>onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("xue", "MainActivity>>>onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("xue", "MainActivity>>>onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("xue", "MainActivity>>>onRestart");
    }


    public void click(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}
