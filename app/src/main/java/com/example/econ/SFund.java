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

public class SFund extends AppCompatActivity{
    EditText comp1an;
    EditText comp2an;
    EditText comp3an;
    TextView comp4an;
    TextView comp5an;
    TextView comp6an;
    TextView comp7an;

    Button btn3an;
    Button btnccdep1an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sfund);


        comp1an = (EditText) findViewById (R.id.ak1an);
        comp2an = (EditText) findViewById (R.id.ak2an);
        comp3an = (EditText) findViewById (R.id.ak3an);
        comp7an = (EditText) findViewById (R.id.ak4an);
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
                double adan = Double.parseDouble (comp7an.getText ( ).toString ( ));
                double d=(aaan-aban)*adan;
                double d1=(1+adan);
                double d2=Math.pow(d1,acan);
                double d4=d/(d2-1);
                double dm=1+adan;
                double dm2=Math.pow(dm,adan)-1;
                double dm3 = (d*dm2)/adan;
                double cm=aaan-dm3;
                comp4an.setText (String.valueOf ("Cm: "+cm));
                comp5an.setText (String.valueOf ("Dm: "  +dm3));
                comp6an.setText (String.valueOf ("d: "+d4));


            }
        });
        btnccdep1an.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1an.setText (String.valueOf (""));
                comp2an.setText (String.valueOf (""));
                comp3an.setText (String.valueOf (""));
                comp7an.setText (String.valueOf (""));
                comp4an.setText (String.valueOf ("Cm:"));
                comp5an.setText (String.valueOf ("Dm:  "));
                comp6an.setText (String.valueOf ("d:  "));


            }

        });
    }
}


