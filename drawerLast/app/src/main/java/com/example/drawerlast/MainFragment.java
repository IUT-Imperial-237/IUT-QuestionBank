package com.example.drawerlast;


import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    public MainFragment () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        ImageButton imageButtonCse, imageButtonEee, imageButtonMce, imageButtonCee, imageButtonBtm, imageButtonTve;
        // Inflate the layout for this fragment
        View rootView = inflater.inflate (R.layout.fragment_main, container, false);
        imageButtonCse = rootView.findViewById (R.id.imageButtonCse);
        imageButtonEee = rootView.findViewById (R.id.imageButtonEee);
        imageButtonMce = rootView.findViewById (R.id.imageButtonMce);
        imageButtonCee = rootView.findViewById (R.id.imageButtonCee);
        imageButtonBtm = rootView.findViewById (R.id.imageButtonBtm);
        imageButtonTve = rootView.findViewById (R.id.imageButtonTve);


        imageButtonCse.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick (View v) {


                SemesterFragment fragment = new SemesterFragment ();
                Bundle bundle = new Bundle ();
                bundle.putString ("department", SemesterFragment.CSE);
                fragment.setArguments (bundle);
                FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace (R.id.fragment_container, fragment);
                fragmentTransaction.commit ();

            }
        });

        imageButtonEee.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick (View v) {


                SemesterFragment fragment = new SemesterFragment ();
                Bundle bundle = new Bundle ();
                bundle.putString ("department", SemesterFragment.EEE);
                fragment.setArguments (bundle);
                FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace (R.id.fragment_container, fragment);
                fragmentTransaction.commit ();

            }
        });

        imageButtonMce.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick (View v) {


                SemesterFragment fragment = new SemesterFragment ();
                Bundle bundle = new Bundle ();
                bundle.putString ("department", SemesterFragment.MCE);
                fragment.setArguments (bundle);
                FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace (R.id.fragment_container, fragment);
                fragmentTransaction.commit ();

            }
        });

        imageButtonCee.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick (View v) {


                SemesterFragment fragment = new SemesterFragment ();
                Bundle bundle = new Bundle ();
                bundle.putString ("department", SemesterFragment.CEE);
                fragment.setArguments (bundle);
                FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace (R.id.fragment_container, fragment);
                fragmentTransaction.commit ();

            }
        });

        imageButtonBtm.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick (View v) {


                SemesterFragment fragment = new SemesterFragment ();
                Bundle bundle = new Bundle ();
                bundle.putString ("department", SemesterFragment.BTM);
                fragment.setArguments (bundle);
                FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace (R.id.fragment_container, fragment);
                fragmentTransaction.commit ();

            }
        });

        imageButtonTve.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick (View v) {


                SemesterFragment fragment = new SemesterFragment ();
                Bundle bundle = new Bundle ();
                bundle.putString ("department", SemesterFragment.TVE);
                fragment.setArguments (bundle);
                FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace (R.id.fragment_container, fragment);
                fragmentTransaction.commit ();

            }
        });

        return rootView;
    }

}
