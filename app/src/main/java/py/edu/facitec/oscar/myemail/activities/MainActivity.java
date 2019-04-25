package py.edu.facitec.oscar.myemail.activities;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import py.edu.facitec.oscar.myemail.R;
import py.edu.facitec.oscar.myemail.fragments.DataFragment;
import py.edu.facitec.oscar.myemail.fragments.DetailFragment;
import py.edu.facitec.oscar.myemail.model.Email;

public class MainActivity extends AppCompatActivity implements DataFragment.OnFragmentInteractionListener {

    DetailFragment detailFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetail);
    }

    @Override
    public void onFragmentInteraction(Email email) {
        if(detailFragment!=null){
            detailFragment.render(email);
        }else{
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("email",email);
            startActivity(i);
        }
    }
}
