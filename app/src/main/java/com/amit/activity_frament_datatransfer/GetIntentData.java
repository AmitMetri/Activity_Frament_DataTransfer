package com.amit.activity_frament_datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetIntentData extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent_data);

        textView = findViewById(R.id.textView);

        //get data from intent
        textView.setText(getIntent().getStringExtra("data"));


    }
}
