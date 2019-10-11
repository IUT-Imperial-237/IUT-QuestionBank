package com.example.drawerlast;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
private ImageButton imageButtonCse,imageButtonEee,imageButtonMce,imageButtonCee,imageButtonBtm,imageButtonTve;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_main, container, false);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final ImageButton imageButtonCse = rootView.findViewById(R.id.imageButtonCse);
        final ImageButton imageButtonEee = rootView.findViewById(R.id.imageButtonEee);
        final ImageButton imageButtonMce = rootView.findViewById(R.id.imageButtonMce);
        final ImageButton imageButtonCee = rootView.findViewById(R.id.imageButtonCee);
        final ImageButton imageButtonBtm = rootView.findViewById(R.id.imageButtonBtm);
        final ImageButton imageButtonTve = rootView.findViewById(R.id.imageButtonTve);






        imageButtonCse.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                CseFragment fragment = new CseFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

            }
        });

        imageButtonEee.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                EeeeFragment fragment = new  EeeeFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

            }
        });

        imageButtonMce.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                MceFragment fragment = new MceFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

            }
        });

        imageButtonCee.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                CeeFragment fragment = new CeeFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

            }
        });

        imageButtonBtm.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                BtmFragment fragment = new BtmFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

            }
        });

        imageButtonTve.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                TveFragment fragment = new TveFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = Objects.requireNonNull (getActivity ()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

            }
        });

        return rootView;
    }

}
