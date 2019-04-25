package py.edu.facitec.oscar.myemail.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import py.edu.facitec.oscar.myemail.R;
import py.edu.facitec.oscar.myemail.model.Email;


public class DetailFragment extends Fragment {

    TextView subject;
    TextView sender;
    TextView message;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_detail, container, false);
        subject = view.findViewById(R.id.subjectTextView);
        sender = view.findViewById(R.id.senderTextView);
        message = view.findViewById(R.id.messageTextView);
        return view;
    }

    public void render(Email e){
        subject.setText(e.getSubject());
        sender.setText(e.getSender());
        message.setText(e.getMessage());
    }

}
