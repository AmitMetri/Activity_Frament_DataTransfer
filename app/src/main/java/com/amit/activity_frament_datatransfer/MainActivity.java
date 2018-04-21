package com.amit.activity_frament_datatransfer;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button =  (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        //Pass data in intent
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pass the data of primitive type using intent.putExtra
                Intent intent = new Intent(MainActivity.this, GetIntentData.class);
                intent.putExtra("data", editText.getText().toString());
                startActivity(intent);
            }
        });

        //Pass data in bundle
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pass the data of primitive type using bundle
                Intent intent = new Intent(MainActivity.this, GetBundleData.class);
                Bundle bundle = new Bundle();
                bundle.putString("data", editText.getText().toString());
                intent.putExtra("BUNDLE", bundle);
                startActivity(intent);
            }
        });

    }
}
