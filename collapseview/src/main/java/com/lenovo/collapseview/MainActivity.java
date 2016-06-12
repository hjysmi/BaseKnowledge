package com.lenovo.collapseview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CollapseView mCollapseView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mCollapseView=(CollapseView) findViewById(R.id.collapseView);
        mCollapseView.setNumber("1");
        mCollapseView.setTitle("This is title");
        mCollapseView.setContent(R.layout.view_expand);
    }
}
