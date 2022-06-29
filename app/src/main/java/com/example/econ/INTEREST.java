package com.example.econ;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class INTEREST extends Fragment {
    EditText pr1ac;
    EditText pr2ac;
    EditText pr3ac;
    Button button77ac;
    EditText pr4ac;
    Button btncc3ac;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View RootViewssac = inflater.inflate (R.layout.activity_interest, container, false);

        pr1ac = RootViewssac.findViewById (R.id.period1ac);
        pr2ac = RootViewssac.findViewById (R.id.period2ac);
        pr3ac = RootViewssac.findViewById (R.id.period3ac);
        button77ac = RootViewssac.findViewById (R.id.button7ac);
        pr4ac = RootViewssac.findViewById (R.id.period4ac);
        btncc3ac = RootViewssac.findViewById (R.id.btnc3ac);

        button77ac.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty (pr1ac.getText ( ))) {

                    pr1ac.setError ("please input");
                    pr1ac.requestFocus ( );
                } else if (TextUtils.isEmpty (pr2ac.getText ( ))) {

                    pr2ac.setError ("please input");
                    pr2ac.requestFocus ( );
                } else if (TextUtils.isEmpty (pr3ac.getText ( ))) {

                    pr3ac.setError ("please input");
                    pr3ac.requestFocus ( );
                } else {

                    double prr1ac = Double.parseDouble (pr1ac.getText ( ).toString ( ));
                    double prr2ac = Double.parseDouble (pr2ac.getText ( ).toString ( ));
                    double prr3ac = Double.parseDouble (pr3ac.getText ( ).toString ( ));
                    double interest = (((prr1ac /prr2ac) - 1) /prr3ac);
                    pr4ac.setText (String.valueOf (interest));

                }


            }

        });
        btncc3ac.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {

                pr1ac.setText (" ");
                pr2ac.setText (" ");
                pr3ac.setText (" ");
                pr4ac.setText (" ");




            }


        });

        return RootViewssac;

    }


}
