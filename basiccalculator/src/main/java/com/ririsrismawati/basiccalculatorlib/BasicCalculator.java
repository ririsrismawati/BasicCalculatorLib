package com.ririsrismawati.basiccalculatorlib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Riris.
 */
public class BasicCalculator {
    float countResult;

    public float add(float num1, float num2){
        return countResult = num1 + num2;
    }

    public float subtrack(float num1, float num2){
        return countResult = num1 - num2;
    }

    public float multiply(float num1, float num2){
        return countResult = num1 * num2;
    }

    public float divide(float num1, float num2){
        return countResult = num1 / num2;
    }

}
