package com.example.john.flooring2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    TextView tvWidth;
    TextView tvLength;


    public static final int CIS_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvWidth = (TextView) findViewById(R.id.numberRW);
        tvLength = (TextView) findViewById(R.id.numberRL);
    }


    public void onButtonClick(View view) {

        Double width = Double.parseDouble(tvWidth.getText().toString());
        Double length = Double.parseDouble(tvLength.getText().toString());

        Intent Double = new Intent(this, ResultActivity.class);
        Double.putExtra("width", width);
        Double.putExtra("length", length);
        startActivityForResult(Double, CIS_CODE);

    }

}