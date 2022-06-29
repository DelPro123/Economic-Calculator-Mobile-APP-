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

public class AF extends AppCompatActivity{
    EditText comp1an;
    EditText comp2an;
    EditText comp3an;
    TextView comp4an;
    TextView comp5an;
    TextView comp6an;
    Button btn3an;
    Button btnccdep1an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_af);


        comp1an = (EditText) findViewById (R.id.ak1an);
        comp2an = (EditText) findViewById (R.id.ak2an);
        comp3an = (EditText) findViewById (R.id.ak3an);
        btn3an = (Button) findViewById (R.id.button9an);
        comp4an = (TextView) findViewById (R.id.textView5an);
        comp5an = (TextView) findViewById (R.id.textViewan);
        comp6an = (TextView) findViewById (R.id.textView6an);
        btnccdep1an = (Button) findViewById (R.id.btncdepan);

        btn3an.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty (comp1an.getText ( ))) {

                    comp1an.setError ("please input");
                    comp1an.requestFocus ( );
                } else if (TextUtils.isEmpty (comp2an.getText ( ))) {

                    comp2an.setError ("please input");
                    comp2an.requestFocus ( );
                } else if (TextUtils.isEmpty (comp3an.getText ( ))) {

                    comp3an.setError ("please input");
                    comp3an.requestFocus ( );
                } else {
                    double aaan = Double.parseDouble (comp1an.getText ( ).toString ( ));
                    double aban = Double.parseDouble (comp2an.getText ( ).toString ( ));
                    double acan = Double.parseDouble (comp3an.getText ( ).toString ( ));

                    double pant = 1+acan;
                    double pant1 =Math.pow (pant,aban);
                    double pant2 =(aaan*(pant1-1))/acan;
                    comp4an.setText (String.valueOf ("Annuity: "+pant2));
                    comp5an.setText (String.valueOf ("Annuity Due: "  +pant2));
                    comp6an.setText (String.valueOf ("Deffered AN: "+pant2));


                }



            }
        });
        btnccdep1an.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1an.setText (String.valueOf (""));
                comp2an.setText (String.valueOf (""));
                comp3an.setText (String.valueOf (""));
                comp4an.setText (String.valueOf ("Annuity:"));
                comp5an.setText (String.valueOf ("Annuity Due:  "));
                comp6an.setText (String.valueOf ("Deffered AN:  "));


            }

        });
    }
}


