package com.example.tappydefender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    final Button buttonPlay =
            (Button)findViewById(R.id.buttonPlay);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}