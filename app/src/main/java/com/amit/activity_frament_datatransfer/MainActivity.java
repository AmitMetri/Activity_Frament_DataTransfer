package com.amit.activity_frament_datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import activity_to_activity.GetBundleData;
import activity_to_activity.GetIntentData;
import activity_to_activity.GetParcelData;
import activity_to_activity.Person;
import activity_to_fragment.FragmentContainerActivity;

public class MainActivity extends AppCompatActivity {

    public EditText editText, editText2, editText3;
    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editName);
        editText2 = findViewById(R.id.editSurname);
        editText3 = findViewById(R.id.editEmail);
        button =  (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        /*REFERENCE LINK
    https://www.survivingwithandroid.com/2012/09/passing-data-between-activities-2.html
*/
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

        //Pass object in parcelable
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GetParcelData.class);
                Person p = new Person();
                p.setName(editText.getText().toString());
                p.setSurname(editText2.getText().toString());
                p.setEmail(editText3.getText().toString());
                i.putExtra("person", p);
                startActivity(i);
            }
        });

        //Pass data to Fragment in Bundle
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, FragmentContainerActivity.class);
                startActivity(intent);
            }
        });
    }
}
