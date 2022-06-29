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

public class CompoundInterest extends AppCompatActivity{
     EditText comp1;
     EditText comp2;
     EditText comp3;
    EditText compp4;
     TextView comp4;
    TextView comp5;
    TextView comp6;
    TextView comp7;
     Button btn3;
     Button btnccdep1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_compound_interest);


        comp1 = (EditText) findViewById (R.id.ak1);
        comp2 = (EditText) findViewById (R.id.ak2);
        comp3 = (EditText) findViewById (R.id.ak3);
        compp4 = (EditText) findViewById (R.id.ak4);
        btn3 = (Button) findViewById (R.id.button9);
        comp4 = (TextView) findViewById (R.id.textView5);
        comp5 = (TextView) findViewById (R.id.textView);
        comp6 = (TextView) findViewById (R.id.textView6);
        comp7 = (TextView) findViewById (R.id.textView7);
        btnccdep1 = (Button) findViewById (R.id.btncdep);

        btn3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty (comp1.getText ( ))) {

                    comp1.setError ("please input");
                    comp1.requestFocus ( );
                } else if (TextUtils.isEmpty (comp2.getText ( ))) {

                    comp2.setError ("please input");
                    comp2.requestFocus ( );
                } else if (TextUtils.isEmpty (comp3.getText ( ))) {

                    comp3.setError ("please input");
                    comp3.requestFocus ( );
                } else {
                    double aa = Double.parseDouble (comp1.getText ( ).toString ( ));
                    double ab = Double.parseDouble (comp2.getText ( ).toString ( ));
                    double ac = Double.parseDouble (comp3.getText ( ).toString ( ));
                    double m = Double.parseDouble (compp4.getText ( ).toString ( ));
                    double compound=(1+ab);
                    double compound1=Math.pow (compound,ac);
                    double compound2=aa*compound1;
                    comp5.setText (String.valueOf ("Compound I: "+compound2));
                    double continous=ab*ac;
                    double continous1=Math.pow (2.718281828,continous);
                    double continous2=aa*continous1;
                    comp4.setText (String.valueOf ("Continous: "+continous2));
                    double nominal=(1+((ac*ab)/m));
                    double nominal2=Math.pow(nominal,m);
                    double nominal3=nominal2-1;
                    comp6.setText (String.valueOf ("Nominal : "+nominal3));
                    comp7.setText (String.valueOf ("Effective : "+nominal3));

                }


            }
        });
        btnccdep1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View views) {
                comp1.setText (String.valueOf (""));
                comp2.setText (String.valueOf (""));
                comp3.setText (String.valueOf (""));
                comp4.setText (String.valueOf ("Compound Interest:"));
                compp4.setText (String.valueOf (""));
                comp5.setText (String.valueOf ("Compound Interest:  "));
                comp6.setText (String.valueOf ("Nominal Rate:  "));
                comp7.setText (String.valueOf ("Effective Rate: "));

            }

        });
    }
}


