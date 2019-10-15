package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bOne;

    private Button bFour;

    private Button bSeven;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bOne = this.findViewById(R.id.bOne);
        this.bOne.setOnClickListener(this);

        this.bFour = this.findViewById(R.id.bFour);
        this.bFour.setOnClickListener(this);

        this.bSeven = this.findViewById(R.id.bSeven);
        this.bSeven.setOnClickListener(this);


    }
}
