package com.example.tiarh.jointparty;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by tiarh on 23/09/2018.
 */

public class SplashScreenActivity extends AppCompatActivity {

    ProgressBar progress_login;
    final Handler handler = new Handler();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash_screen);

        getSupportActionBar().hide();

        progress_login = findViewById(R.id.progress_login);

//        Drawable progressDrawable = progress_login.getIndeterminateDrawable().mutate();
//        Drawable t = progress_login.getIndeterminateDrawable().mutate();
//
//        progressDrawable.setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
//        t.setColorFilter(Color.BLACK, android.graphics.PorterDuff.Mode.SRC_IN);
//
//        progress_login.setIndeterminateDrawable(progressDrawable);
//        progress_login.setIndeterminateDrawableTiled(t);
//        progress_login.setProgressTintList(ColorStateList.valueOf(Color.WHITE));

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent r = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(r);
            }
        }, 2500);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    public void startProgress(View view) {
        progress_login.setProgress(0);
        new Thread(new Task()).start();
    }

    class Task implements Runnable {
        @Override
        public void run() {
            int i;
            for (i = 0; i <= 10; i++) {
                final int value = i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress_login.setProgress(value);
            }
        }
    }
}
