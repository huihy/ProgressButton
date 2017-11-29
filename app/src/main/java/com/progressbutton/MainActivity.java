package com.progressbutton;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.circleprogressbutton.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    private CircularProgressButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.loginbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setIndeterminateProgressMode(true);
                button.setProgress(50);
                Log.e("xx","xx");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button.setProgress(100);
                        button.setProgress(0);
                    }
                },5000);
            }
        });

    }
}
