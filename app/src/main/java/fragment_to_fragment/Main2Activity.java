package fragment_to_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amit.activity_frament_datatransfer.R;

public class Main2Activity extends AppCompatActivity  implements  FragmentC.OnHeadlineSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*Default Fragment*/
        FragmentC fragmentC = new FragmentC();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragmentC).commit();

    }


    /*Implement the Interface which is defined in data sending Fragment
    * From this activity you should be sending data to data receiving Fragment*/
    @Override
    public void onArticleSelected(String data) {

        Bundle bundle = new Bundle();
        bundle.putString("data", data);
        FragmentD fragmentD = new FragmentD();
        fragmentD.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentD).commit();


    }
}
