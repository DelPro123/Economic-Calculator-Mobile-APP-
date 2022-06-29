package com.example.econ;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AP extends AppCompatActivity{
    EditText comp1ap;
    EditText comp2ap;
    EditText comp3ap;
    TextView comp4ap;
    TextView comp5ap;
    TextView comp6ap;
    Button btn3ap;
    Button btnccdep1ap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_ap);


                comp1ap = (EditText) findViewById (R.id.ak1ap);
                comp2ap = (EditText) findViewById (R.id.ak2ap);
                comp3ap = (EditText) findViewById (R.id.ak3ap);
                btn3ap = (Button) findViewById (R.id.button9ap);
                comp4ap = (TextView) findViewById (R.id.textView5ap);
                comp5ap = (TextView) findViewById (R.id.textViewap);
                comp6ap = (TextView) findViewById (R.id.textView6ap);
                btnccdep1ap = (Button) findViewById (R.id.btncdepap);


        btn3ap.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty (comp1ap.getText ( ))) {

                    comp1ap.setError ("please input");
                    comp1ap.requestFocus ( );
                } else if (TextUtils.isEmpty (comp2ap.getText ( ))) {

                    comp2ap.setError ("please input");
                    comp2ap.requestFocus ( );
                } else if (TextUtils.isEmpty (comp3ap.getText ( ))) {

                    comp3ap.setError ("please input");
                    comp3ap.requestFocus ( );
                } else {
                    double aaap = Double.parseDouble (comp1ap.getText ( ).toString ( ));
                    double abap = Double.parseDouble (comp2ap.getText ( ).toString ( ));
                    double acap = Double.parseDouble (comp3ap.getText ( ).toString ( ));

                    double pant = 1 + acap;
                    double pant1 = Math.pow (pant, abap);
                    double pant3 = (1 + acap);
                    double pant4 = Math.pow (pant3, abap);
                    double pant2 = (aaap * (pant1 - 1)) / (acap * pant4);
                    comp4ap.setText (String.valueOf ("Annuity: " + pant2));
                    double pan = 1 + acap;
                    double pan1 = Math.pow (pan, abap);
                    double pan3 = (1 + acap);
                    double pann = abap - 1;
                    double pan4 = Math.pow (pan3, pann);
                    double pan2 = (aaap * (pan1 - 1)) / (acap * pan4);
                    comp5ap.setText (String.valueOf ("Annuity Due: " + pan2));
                    double pt = 1 + acap;
                    double pt1 = Math.pow (pt, abap);
                    double pt3 = (1 + acap);
                    double pnn = abap + 1;
                    double pt4 = Math.pow (pt3, pnn);
                    double pt2 = (aaap * (pt1 - 1)) / (acap * pt4);
                    comp6ap.setText (String.valueOf ("Deffered AN: " + pt3));

                }
            }

        });
        btnccdep1ap.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1ap.setText (String.valueOf (""));
                comp2ap.setText (String.valueOf (""));
                comp3ap.setText (String.valueOf (""));
                comp4ap.setText (String.valueOf ("Annuity:"));
                comp5ap.setText (String.valueOf ("Annuity Due:  "));
                comp6ap.setText (String.valueOf ("Deffered AN:  "));


            }

        });
    }
}


