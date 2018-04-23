package activity_to_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amit.activity_frament_datatransfer.R;

public class FragmentActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_a);

        //Pass data to Fragment
        Bundle bundle = new Bundle();
        bundle.putString("data", getIntent().getStringExtra("MAIN"));
        Fragment_A fragment_a = new Fragment_A();
        fragment_a.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,  fragment_a).commit();

    }
}
