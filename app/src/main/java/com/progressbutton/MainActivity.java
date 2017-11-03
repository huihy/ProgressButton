package com.progressbutton;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.circleprogressbutton.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    private CircularProgressButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.loginbtn);
        button.setIndeterminateProgressMode(true);
        button.setProgress(50);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setProgress(0);
            }
        },3000);
    }
}
