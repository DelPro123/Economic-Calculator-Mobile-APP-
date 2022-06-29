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

public class IF extends AppCompatActivity{
    EditText comp1if;
    EditText comp2if;
    EditText comp3if;
    EditText compp4if;
    Button   btnccdep1if;
    Button   btn3if;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_if);


        comp1if = (EditText) findViewById (R.id.ak1if);
        comp2if = (EditText) findViewById (R.id.ak2if);
        comp3if = (EditText) findViewById (R.id.ak3if);
        compp4if = (EditText) findViewById (R.id.ak4if);
        btn3if = (Button) findViewById (R.id.button9if);

        btnccdep1if = (Button) findViewById (R.id.btncdepif);

        btn3if.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty (comp1if.getText ( ))) {

                    comp1if.setError ("please input");
                    comp1if.requestFocus ( );
                } else if (TextUtils.isEmpty (comp2if.getText ( ))) {

                    comp2if.setError ("please input");
                    comp2if.requestFocus ( );
                } else if (TextUtils.isEmpty (comp3if.getText ( ))) {

                    comp3if.setError ("please input");
                    comp3if.requestFocus ( );
                } else {
                    double fc = Double.parseDouble (comp1if.getText ( ).toString ( ));
                    double f = Double.parseDouble (comp2if.getText ( ).toString ( ));
                    double ac = Double.parseDouble (comp3if.getText ( ).toString ( ));

                    double cp=(1+f);
                    double cp1= Math.pow (cp,ac);
                    double cp2=fc*cp1;

                    compp4if.setText (String.valueOf (cp2));

                }


            }
        });
        btnccdep1if.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1if.setText (String.valueOf (""));
                comp2if.setText (String.valueOf (""));
                comp3if.setText (String.valueOf (""));
                compp4if.setText (String.valueOf (""));


            }

        });
    }
}


