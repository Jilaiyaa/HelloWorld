package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bOne;

    private Button bTwo;

    private Button bThree;

    private Button bFour;

    private Button bFive;

    private Button bSix;

    private Button bSeven;

    private Button bEight;

    private Button bNine;

    private Button bZero;

    private Button bMinus;

    private Button bPlus;

    private Button bMal;

    private Button bDivide;

    private Button bClear;

    private Button bCalculate;

    private TextView tvNumberOne;

    private TextView tvOperator;

    private TextView tvNumberTwo;

    private TextView tvEqual;

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bOne = this.findViewById(R.id.bOne);
        this.bOne.setOnClickListener(this);

        this.bTwo = this.findViewById(R.id.bTwo);
        this.bTwo.setOnClickListener(this);

        this.bThree = this.findViewById(R.id.bThree);
        this.bThree.setOnClickListener(this);

        this.bFour = this.findViewById(R.id.bFour);
        this.bFour.setOnClickListener(this);

        this.bFive = this.findViewById(R.id.bFive);
        this.bFive.setOnClickListener(this);

        this.bSix = this.findViewById(R.id.bSix);
        this.bSix.setOnClickListener(this);

        this.bSeven = this.findViewById(R.id.bSeven);
        this.bSeven.setOnClickListener(this);

        this.bEight = this.findViewById(R.id.bEight);
        this.bEight.setOnClickListener(this);

        this.bNine = this.findViewById(R.id.bNine);
        this.bNine.setOnClickListener(this);

        this.bZero = this.findViewById(R.id.bZero);
        this.bZero.setOnClickListener(this);

        this.bPlus = this.findViewById(R.id.bPlus);
        this.bPlus.setOnClickListener(this);

        this.bMinus = this.findViewById(R.id.bMinus);
        this.bMinus.setOnClickListener(this);

        this.bMal = this.findViewById(R.id.bMal);
        this.bMal.setOnClickListener(this);

        this.bDivide = this.findViewById(R.id.bDivide);
        this.bDivide.setOnClickListener(this);

        this.bClear = this.findViewById(R.id.bClear);
        this.bClear.setOnClickListener(this);

        this.bCalculate = this.findViewById(R.id.bCalculate);
        this.bCalculate.setOnClickListener(this);


        this.tvEqual = this.findViewById(R.id.tvEqual);
        this.tvNumberOne = this.findViewById(R.id.tvNumberOne);
        this.tvNumberTwo = this.findViewById(R.id.tvNumberTwo);
        this.tvOperator = this.findViewById(R.id.tvOperator);
        this.tvResult = this.findViewById(R.id.tvResult);

    }

    @Override
    public void onClick(View v) {

    }
}
