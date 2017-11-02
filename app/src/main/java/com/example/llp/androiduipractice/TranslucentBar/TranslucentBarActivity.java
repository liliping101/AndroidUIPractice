package com.example.llp.androiduipractice.TranslucentBar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.llp.androiduipractice.R;

public class TranslucentBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent_bar);

        Button button = findViewById(R.id.bar_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TranslucentBarActivity.this, ColorTranslucentBarActivity.class));
            }
        });
    }
}
