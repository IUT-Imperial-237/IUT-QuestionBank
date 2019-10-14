package com.example.drawerlast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {link CseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {link CseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CseFragment extends Fragment {
    protected View rootView;
    private Button button;

    public CseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate (R.layout.fragment_cse, container, false);

        button = rootView.findViewById (R.id.button3);

        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Log.d ("Debug-Check:: ", "in Listener Button3");
            }
        });

        return rootView;
    }


}
