package com.example.econ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btns11;
    Button btns12;
    Button btns13;
    Button btns14;
    Button btns15;
    Button btns16;
    Button abus1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        btns11 = findViewById (R.id.button);
        btns12 = findViewById (R.id.button1);
        btns13 = findViewById (R.id.button2);
        btns14 = findViewById (R.id.button3);
        btns15 = findViewById (R.id.button4);
        abus1 = findViewById (R.id.About);

        btns11.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                a ( );
            }
        });
        btns12.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                b ( );
            }
        });
        btns13.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                c ( );
            }
        });
        btns14.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                d ( );
            }

        });
        btns15.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                e ( );
            }

        });
        abus1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                f ( );
            }

        });

    }

    public void a() {
        Intent intent = new Intent (this,SimpleInterest.class);
        startActivity (intent);
    }
    public void b() {
        Intent intent1 = new Intent (this,CompoundInterest.class);
        startActivity (intent1);
    }
    public void c() {
        Intent intent2 = new Intent (this,Annuity.class);
        startActivity (intent2);
    }
    public void d() {
        Intent intent3 = new Intent (this,Inflation.class);
        startActivity (intent3);
    }
    public void e() {
        Intent intent4 = new Intent (this,Depreciation.class);
        startActivity (intent4);
    }
    public void f() {
        Intent intent5 = new Intent (this,AbUs.class);
        startActivity (intent5);
    }
}