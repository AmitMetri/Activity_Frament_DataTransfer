package activity_to_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amit.activity_frament_datatransfer.R;

import activity_to_fragment.Fragment_A;

public class FragmentContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        //Pass data to Fragment
        Bundle bundle = new Bundle();
        bundle.putString("data", "From Activity");
        Fragment_A fragment_a = new Fragment_A();
        fragment_a.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,  fragment_a).commit();
    }
}
