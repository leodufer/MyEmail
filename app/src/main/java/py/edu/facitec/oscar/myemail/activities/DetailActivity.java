package py.edu.facitec.oscar.myemail.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import py.edu.facitec.oscar.myemail.R;
import py.edu.facitec.oscar.myemail.fragments.DetailFragment;
import py.edu.facitec.oscar.myemail.model.Email;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(getIntent().getExtras()!=null){
            Email email = (Email) getIntent().getExtras().getSerializable("email");
            DetailFragment detailFragment= (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentDetail);
            detailFragment.render(email);
        }

    }
}
