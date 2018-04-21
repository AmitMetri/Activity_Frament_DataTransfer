package activity_to_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.amit.activity_frament_datatransfer.R;

public class GetBundleData extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_bundle_data);

        textView = findViewById(R.id.textView);

        //get data from bundle
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("BUNDLE");
        textView.setText(bundle.getString("data"));
    }
}
