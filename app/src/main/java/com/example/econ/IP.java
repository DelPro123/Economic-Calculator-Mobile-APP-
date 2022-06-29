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

public class IP extends AppCompatActivity{
    EditText comp1ip;
    EditText comp2ip;
    EditText comp3ip;
    EditText compp4ip;
    Button   btnccdep1ip;
    Button   btn3ip;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_ip);


        comp1ip = (EditText) findViewById (R.id.ak1ip);
        comp2ip = (EditText) findViewById (R.id.ak2ip);
        comp3ip = (EditText) findViewById (R.id.ak3ip);
        compp4ip = (EditText) findViewById (R.id.ak4ip);
        btn3ip = (Button) findViewById (R.id.button9ip);

        btnccdep1ip = (Button) findViewById (R.id.btncdepip);

        btn3ip.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty (comp1ip.getText ( ))) {

                    comp1ip.setError ("please input");
                    comp1ip.requestFocus ( );
                } else if (TextUtils.isEmpty (comp2ip.getText ( ))) {

                    comp2ip.setError ("please input");
                    comp2ip.requestFocus ( );
                } else if (TextUtils.isEmpty (comp3ip.getText ( ))) {

                    comp3ip.setError ("please input");
                    comp3ip.requestFocus ( );
                } else {
                    double P = Double.parseDouble (comp1ip.getText ( ).toString ( ));
                    double f = Double.parseDouble (comp2ip.getText ( ).toString ( ));
                    double n = Double.parseDouble (comp3ip.getText ( ).toString ( ));

                    double cp=(1+f);
                    double cp1= Math.pow (cp,n);
                    double cp2=P/cp1;

                    compp4ip.setText (String.valueOf (cp2));

                }


            }
        });
        btnccdep1ip.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1ip.setText (String.valueOf (""));
                comp2ip.setText (String.valueOf (""));
                comp3ip.setText (String.valueOf (""));
                compp4ip.setText (String.valueOf (""));


            }

        });
    }
}


