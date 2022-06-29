package com.example.econ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Annuity extends AppCompatActivity {
    Button an;
    Button an2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_annuity);
        an = findViewById (R.id.Abtn1);
        an2 = findViewById (R.id.Abtn2);
        an.setOnClickListener (new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View v) {
                        ann ( );
                    }
                });

        an2.setOnClickListener (new View.OnClickListener ( ) {
        @Override
        public void onClick(View v) {
            ann2A ( );
        }
    });

    }
    public void ann() {
        Intent intentan = new Intent (this,AF.class);
        startActivity (intentan);
    }
    public void ann2A() {
        Intent inant = new Intent (this,AP.class);
        startActivity (inant);
    }
}
