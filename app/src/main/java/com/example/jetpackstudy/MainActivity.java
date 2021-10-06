package com.example.jetpackstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jetpackstudy.LifeCycleTest.LifeCycleTestActivity;
import com.example.jetpackstudy.config.LogConfig;

public class MainActivity extends AppCompatActivity {
    private String TAG = LogConfig.MAIN_TAG_PREFIX + getClass().getSimpleName();
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        tv1 = findViewById(R.id.lifecycle_test);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LifeCycleTestActivity.class);
                startActivity(intent);
            }
        });
        goneTvs();
    }

    private void goneTvs()
    {
//        tv1.setVisibility(View.GONE);
    }
}