package activity_to_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amit.activity_frament_datatransfer.R;


public class Fragment_A extends Fragment {

    TextView textView;

    public Fragment_A() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view=  inflater.inflate(R.layout.fragment_a, container, false);
        textView = view.findViewById(R.id.textView);
        //get the data from Activity
        textView.setText(getArguments().getString("data"));
        return  view;
    }



}
