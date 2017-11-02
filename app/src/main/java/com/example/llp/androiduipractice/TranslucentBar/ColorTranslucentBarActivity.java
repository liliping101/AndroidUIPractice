package com.example.llp.androiduipractice.TranslucentBar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.llp.androiduipractice.R;

public class ColorTranslucentBarActivity extends TranslucentBarBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_color_translucent_bar;
    }
}
