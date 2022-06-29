package com.example.econ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inflation extends AppCompatActivity {
    Button inff1;
    Button inff2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_inflation);
        inff1 = findViewById (R.id.inf1);
        inff2 = findViewById (R.id.inf2);
        inff1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                INF12 ( );
            }
        });
        inff2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                INF2 ( );
            }
        });

    }
    public void INF12() {
        Intent infla1 = new Intent (this,IF.class);
        startActivity (infla1);
    }
    public void INF2() {
        Intent infla2 = new Intent (this,IP.class);
        startActivity (infla2);
    }
}
