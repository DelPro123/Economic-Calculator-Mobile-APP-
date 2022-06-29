package com.example.econ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Depreciation extends AppCompatActivity {
    Button btns11z;
    Button btns12z;
    Button btns13z;
    Button btns14z;
    Button btns15z;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_depreciation);
        btns11z = findViewById (R.id.button61);
        btns12z = findViewById (R.id.button62);
        btns13z = findViewById (R.id.button63);
        btns14z = findViewById (R.id.button65);


        btns11z.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                a ( );
            }
        });
        btns12z.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                b ( );
            }
        });
        btns13z.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                c ( );
            }
        });
        btns14z.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                d ( );
            }

        });


    }

    public void a() {
        Intent intent = new Intent (this,SLine.class);
        startActivity (intent);
    }
    public void b() {
        Intent intent1 = new Intent (this,SFund.class);
        startActivity (intent1);
    }
    public void c() {
        Intent intent2 = new Intent (this,DBalance.class);
        startActivity (intent2);
    }
    public void d() {
        Intent intent3 = new Intent (this,SYSDigit.class);
        startActivity (intent3);
    }

}