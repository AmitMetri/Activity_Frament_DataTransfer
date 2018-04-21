package com.amit.activity_frament_datatransfer;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetParcelDataa extends AppCompatActivity {

    TextView textView, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_parcelable_data);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");
        textView.setText(person.getName());
        textView2.setText(person.getSurname());
        textView3.setText(person.getEmail());


    }
}
