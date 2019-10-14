package com.example.drawerlast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {link CseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {link CseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CseFragment extends Fragment {

    public CseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_cse, container, false);

    }


}
