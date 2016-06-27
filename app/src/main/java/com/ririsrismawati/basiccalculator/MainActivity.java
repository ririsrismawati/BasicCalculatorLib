package com.ririsrismawati.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ririsrismawati.basiccalculatorlib.BasicCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BasicCalculator basicCalculator = new BasicCalculator();

        basicCalculator.add(2,3);
        basicCalculator.subtrack(2,3);
        basicCalculator.multiply(2,3);
        basicCalculator.divide(2,3);

    }
}
