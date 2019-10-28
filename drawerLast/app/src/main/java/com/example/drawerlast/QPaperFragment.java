package com.example.drawerlast;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment
 */
public class QPaperFragment extends Fragment {

    SearchView searchView;
    ArrayAdapter<String> adapter;
    List<String> data;
    ///---Variables
    private ListView listView;
    private Bundle bundle;
    private View rootView;

    public QPaperFragment () {
        // Required empty public constructor
        //test data-------------------------------------------------
        data = new ArrayList<> ();
        data.add ("fopa");
        data.add ("yuffom");
        data.add ("amadou");
        data.add ("yuffom");
        data.add ("olabi");
        data.add ("Olakoinkm");
        //---------------------------------------------------------

    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate (R.layout.fragment_qpaper, container, false);


        init ();
        listener (inflater, container, savedInstanceState);

        return rootView;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void init () {
        bundle = getArguments ();
        listView = rootView.findViewById (R.id.list_item_paper);
        adapter = new ArrayAdapter<> (Objects.requireNonNull (getActivity ()), android.R.layout.simple_list_item_1, data);
        listView.setAdapter (adapter);
    }

    private void listener (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText (getContext (), bundle.getString ("department") + bundle.getInt ("semester") + parent.getItemAtPosition (position), Toast.LENGTH_SHORT).show ();
            }
        });
    }
}
