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

public class DBalance extends AppCompatActivity{
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
        setContentView (R.layout.activity_dbalance);


        comp1an = (EditText) findViewById (R.id.ak1an);
        comp2an = (EditText) findViewById (R.id.ak2an);
        comp3an = (EditText) findViewById (R.id.ak3an);
        btn3an = (Button) findViewById (R.id.button9an);
        comp6an = (TextView) findViewById (R.id.textView6an);
        comp4an = (TextView) findViewById (R.id.textView5an);
        comp5an = (TextView) findViewById (R.id.textViewan);
        btnccdep1an = (Button) findViewById (R.id.btncdepan);

        btn3an.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                double aaan = Double.parseDouble (comp1an.getText ( ).toString ( ));
                double aban = Double.parseDouble(comp2an.getText ( ).toString ( ));
                double acan = Double.parseDouble (comp3an.getText ( ).toString ( ));
                int ss=0;
                double k= 1-Math.pow (aban/aaan,1/acan);
                double d=k*(aaan);
                double cm=aaan-d;
                StringBuilder n= new StringBuilder ();
                comp5an.setText (String.valueOf ("Period                         "+"Depreciation                    "+"Future Value                     "));
                comp6an.setText ("0.0"+"                    "+"                    "+"0.0    "+"                    "+aaan);
                comp4an.setText ("1"+"           "+d+"   "+cm+"\n"+"2"+"           "+(d*k)+"   "+(cm-(d*k))+"\n");

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


            }

        });
    }
}


