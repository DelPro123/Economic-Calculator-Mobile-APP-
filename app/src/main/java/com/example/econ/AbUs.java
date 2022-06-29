package com.example.econ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AbUs extends AppCompatActivity {

    ImageView IMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_ab_us);
        IMG = findViewById (R.id.imageView);
        IMG.setImageResource (R.drawable.icon);
    }
}
