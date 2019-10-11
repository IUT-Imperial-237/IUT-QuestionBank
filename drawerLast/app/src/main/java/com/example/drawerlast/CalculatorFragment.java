package com.example.drawerlast;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorFragment extends Fragment {


    public CalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);

        final Button add = (Button) rootView.findViewById(R.id.add);
        final Button sub = (Button) rootView.findViewById(R.id.sub);
        final Button mul = (Button) rootView.findViewById(R.id.mul);

        final EditText num1 = (EditText) rootView.findViewById(R.id.num1);
       final EditText num2 = (EditText) rootView.findViewById(R.id.num2);
       final TextView result = (TextView) rootView.findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double tempres = number1 + number2;
                result.setText(String.valueOf(tempres));

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double tempres = number1 - number2;
                result.setText(String.valueOf(tempres));
            }
        });


       mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double tempres = number1 * number2;
                result.setText(String.valueOf(tempres));
            }
        });





        return rootView;
    }

}
