package com.example.jetpackstudy.LifeCycleTest;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import com.example.jetpackstudy.R;
import com.example.jetpackstudy.config.LogConfig;

public class LifeCycleTestActivity extends AppCompatActivity {
    private String TAG = LogConfig.LIFECYCLE_TAG_PREFIX + getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle_test);
        getLifecycle().addObserver(new GenericLifecycleObserver() {

            @Override
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                //source其实就是LifeCycleTestActivity类型的
                Log.d(TAG, "onStateChanged: event =" + event);
            }
        });
    }
}
