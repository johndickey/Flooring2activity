package com.example.john.flooring2activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class ResultActivity extends AppCompatActivity {


    TextView Results;


    Bundle extras = getIntent().getExtras();

    Double squareft = (extras.getDouble("width") / extras.getDouble("length"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Results = (TextView) findViewById(R.id.textViewResult);


        Results.setText("Width is" + extras.getDouble("width") + "and Length is" + extras.getDouble("length") + "and flooring needed is" + squareft);


    }

}
