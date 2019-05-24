package com.iagoapp.organizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Handler delay = new Handler (  );
        delay.postDelayed ( new Runnable () {
            @Override
            public void run() {
                mortarInigo ();
            }
        }, 2000 );
    }

    private void mortarInigo() {
        Intent inigo = new Intent ( MainActivity.this, FullscreenActivity.class );
        startActivity ( inigo );
        finish ();
    }
}
