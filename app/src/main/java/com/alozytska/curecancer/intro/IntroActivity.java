package com.alozytska.curecancer.intro;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alozytska.curecancer.R;
import com.alozytska.curecancer.core.ui.BaseActivity;

public class IntroActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
}
