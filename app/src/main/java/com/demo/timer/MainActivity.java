package com.demo.timer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import static com.demo.timer.R.id.timer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_start, bt_stop, bt_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_start =(Button) findViewById(R.id.bt_start);
        bt_stop =(Button) findViewById(R.id.bt_stop);
        bt_clear =(Button) findViewById(R.id.bt_clear);
        timer =(Chronometer) findViewById(R.id.timer);
        bt_start.setOnClickListener(this);
        bt_stop.setOnClickListener(this);
        bt_clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_start:
                timer.start();
                break;
            case R.id.bt_stop:
                timer.stop();
                break;
            case R.id.bt_clear:
                timer.setBase(SystemClock.elapsedRealtime());
                break;
        }
    }
}
