package com.example.jetpackstudy.livedata;

import android.util.Log;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.jetpackstudy.R;
import com.example.jetpackstudy.base.BaseActivity;
import com.example.jetpackstudy.config.LogConfig;
import com.example.jetpackstudy.livedata.model.StudentViewModel;

public class LiveDataTestActivity extends BaseActivity {
    private String TAG = LogConfig.LIVEDATA_TAG_PREFIX + getClass().getSimpleName();
    private TextView mNameTv;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_livedata_test;
    }

    @Override
    protected void initView() {
        mNameTv = findViewById(R.id.name);
        StudentViewModel studentViewModel = new ViewModelProvider(this).get(StudentViewModel.class);
        studentViewModel.getName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d(TAG,"onChange ,s = "+s);
                mNameTv.setText(s);
            }
        });
        studentViewModel.getName().setValue("test");
    }
}
