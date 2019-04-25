package py.edu.facitec.oscar.myemail.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import py.edu.facitec.oscar.myemail.R;
import py.edu.facitec.oscar.myemail.fragments.DataFragment;
import py.edu.facitec.oscar.myemail.model.Email;

public class MainActivity extends AppCompatActivity implements DataFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Email email) {

    }
}
