package com.example.econ;


import android.os.Bundle;
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

public class SLine extends AppCompatActivity{
    EditText comp1an;
    EditText comp2an;
    EditText comp3an;
    TextView comp4an;
    TextView comp5an;
    TextView comp6an;
    Button btn3an;
    Button btnccdep1an;

    @Override
    protected void

    onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sline);


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
                double aaan = Double.parseDouble (comp1an.getText ( ).toString ( ));
                double aban = Double.parseDouble (comp2an.getText ( ).toString ( ));
                double acan = Double.parseDouble (comp3an.getText ( ).toString ( ));
                StringBuilder n= new StringBuilder ();
                comp5an.setText (String.valueOf ("Period                         "+"Depreciation                    "+"Future Value                     "));
                double ss=0;
                double d =(aaan-aban)/acan;
                double cm =aaan-d;
                double dm=d*(acan);
                for(ss=1;ss<=acan;ss++){

                    n.append (String.valueOf (ss+"                    "+"                    "+d+"                    "+(dm-d)+"\n"));






                }
                    comp6an.setText ("0.0"+"                    "+"                    "+"0.0    "+"                    "+aaan);
                    comp4an.setText (n);

            }
        });
        btnccdep1an.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1an.setText (String.valueOf (""));
                comp2an.setText (String.valueOf (""));
                comp3an.setText (String.valueOf (""));
                comp4an.setText (String.valueOf (""));
                comp5an.setText (String.valueOf (""));
                comp6an.setText (String.valueOf (""));


            }

        });
    }
}


