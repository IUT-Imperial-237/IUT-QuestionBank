package com.example.drawerlast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {link EeeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {link EeeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EeeFragment extends Fragment {

    private ImageButton sem1;
    private ImageButton sem2;
    private ImageButton sem3;
    private ImageButton sem4;
    private ImageButton sem5;
    private ImageButton sem6;
    private ImageButton sem7;
    private ImageButton sem8;

    private View rootView;

    public EeeFragment () {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        init (inflater, container, savedInstanceState);
        listener (inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_eeee, container, false);
    }

    void init (LayoutInflater inflater, ViewGroup container,
               Bundle savedInstanceState) {
        rootView = inflater.inflate (R.layout.fragment_eeee, container, false);
        //Log.d(rootView.getTag ().toString ()," in EeeFragment");
        sem1 = rootView.findViewById (R.id.imageButtonEeeSem1);
        sem2 = rootView.findViewById (R.id.imageButtonEeeSem2);
        sem3 = rootView.findViewById (R.id.imageButtonEeeSem3);
        sem4 = rootView.findViewById (R.id.imageButtonEeeSem4);
        sem5 = rootView.findViewById (R.id.imageButtonEeeSem5);
        sem6 = rootView.findViewById (R.id.imageButtonEeeSem6);
        sem7 = rootView.findViewById (R.id.imageButtonEeeSem7);
        sem8 = rootView.findViewById (R.id.imageButtonEeeSem8);
    }

    void listener (LayoutInflater inflater, final ViewGroup container,
                   Bundle savedInstanceState) {
        sem1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Toast.makeText (getActivity (), "EEE Semester 1", Toast.LENGTH_SHORT).show ();
            }
        });

        sem2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });

        sem3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });

        sem4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });

        sem5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });

        sem6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });

        sem7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });

        sem8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

            }
        });
    }
}
