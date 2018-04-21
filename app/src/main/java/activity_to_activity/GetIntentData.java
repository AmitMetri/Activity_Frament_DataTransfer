package activity_to_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.amit.activity_frament_datatransfer.R;

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
