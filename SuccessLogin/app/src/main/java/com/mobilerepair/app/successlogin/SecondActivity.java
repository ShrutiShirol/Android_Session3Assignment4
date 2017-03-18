package com.mobilerepair.app.successlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt = (TextView)findViewById(R.id.txt);

        Intent intent = getIntent();
        String user = intent.getStringExtra("user_name");
        Log.i("username","" +user);

        txt.setText(user);



    }
}
