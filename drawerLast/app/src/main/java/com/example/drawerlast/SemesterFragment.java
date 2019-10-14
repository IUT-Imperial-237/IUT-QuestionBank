package com.example.drawerlast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment
 */
public class SemesterFragment extends Fragment {

    ///----Variables
    public static final String CSE = "CSE";
    public static final String CEE = "CEE";
    public static final String MCE = "MCE";
    public static final String TVE = "TVE";
    public static final String BTM = "BTM";
    public static final String EEE = "EEE";

    private Bundle bundle;
    private View rootView;

    private ImageButton sem1;
    private ImageButton sem2;
    private ImageButton sem3;
    private ImageButton sem4;
    private ImageButton sem5;
    private ImageButton sem6;
    private ImageButton sem7;
    private ImageButton sem8;
    private ImageButton sem9;

    private ImageView imageView;
    private TextView txtTitle;


    public SemesterFragment () {
        // Required empty public constructor
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate (R.layout.fragment_semester, container, false);
        init ();
        listener (inflater, container, savedInstanceState);
        return rootView;
    }

    private void init () {
        bundle = getArguments ();

        sem1 = rootView.findViewById (R.id.iBtnSem1);
        sem2 = rootView.findViewById (R.id.iBtnSem2);
        sem3 = rootView.findViewById (R.id.iBtnSem3);
        sem4 = rootView.findViewById (R.id.iBtnSem4);
        sem5 = rootView.findViewById (R.id.iBtnSem5);
        sem6 = rootView.findViewById (R.id.iBtnSem6);
        sem7 = rootView.findViewById (R.id.iBtnSem7);
        sem8 = rootView.findViewById (R.id.iBtnSem8);
        sem9 = rootView.findViewById (R.id.iBtnSem9);

        imageView = rootView.findViewById (R.id.imageView);
        txtTitle = rootView.findViewById (R.id.textViewDepartment);

        txtTitle.setText (bundle.getString ("department"));

        switch (txtTitle.getText ().toString ()) {
            case SemesterFragment.CSE:
                imageView.setImageResource (R.mipmap.ic_cse_main);
                break;
            case SemesterFragment.MCE:
                imageView.setImageResource (R.mipmap.ic_mce_main);
                break;
            case SemesterFragment.EEE:
                imageView.setImageResource (R.mipmap.ic_eee_main);
                break;
            case SemesterFragment.TVE:
                imageView.setImageResource (R.mipmap.ic_tve_main);
                break;
            case SemesterFragment.CEE:
                imageView.setImageResource (R.mipmap.ic_cee_main);
                break;
            case SemesterFragment.BTM:
                imageView.setImageResource (R.mipmap.ic_btm_main);
                break;
        }
    }

    private void listener (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        sem1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (rootView.getContext (), txtTitle.getText ().toString () + "Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });
    }
}
